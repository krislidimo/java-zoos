package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.model.Zoo;
import com.lambdaschool.javazoos.repo.ZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
