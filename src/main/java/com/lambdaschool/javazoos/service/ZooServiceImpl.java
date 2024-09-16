package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.model.Telephone;
import com.lambdaschool.javazoos.model.Zoo;
import com.lambdaschool.javazoos.repo.ZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService{
    @Autowired
    private ZooRepo zooRepo;

    @Override
    public ArrayList<Zoo> findAll() {
        ArrayList<Zoo> list = new ArrayList<>();
        zooRepo.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @Transactional
    @Override
    public void delete(long id) {
//        if (zooRepo.findById(id).isPresent()) {
            zooRepo.deleteZooFromZooanimal(id);
            zooRepo.deleteById(id);
//        } else {
//            throw new EntityNotFoundException(Long.toString(id));
//        }
    }

    @Override
    public Zoo update(Zoo zoo, long id) {
        Zoo currentZoo = zooRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));

        if (zoo.getZooname() != null)
        {
            currentZoo.setZooname(zoo.getZooname());
        }

        if (zoo.getTelephones().size() > 0)
        {
            // adds new phone numbers to list
            for (Telephone t:zoo.getTelephones())
            {
                currentZoo.getTelephones().add(new Telephone(t.getPhonetype(),t.getPhonenumber(), currentZoo));
            }
        }

        return zooRepo.save(currentZoo);
    }

    @Transactional
    @Override
    public Zoo save(Zoo zoo) {
        Zoo newZoo = new Zoo();

        newZoo.setZooname(zoo.getZooname());

        for (Telephone t:zoo.getTelephones())
        {
            newZoo.getTelephones().add(new Telephone(t.getPhonetype(),t.getPhonenumber(), newZoo));
        }

        return zooRepo.save(newZoo);
    }
}
