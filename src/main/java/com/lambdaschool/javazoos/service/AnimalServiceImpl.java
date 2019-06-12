package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.model.Animal;
import com.lambdaschool.javazoos.repo.AnimalRepo;
import com.lambdaschool.javazoos.view.CountAnimalsInZoos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    private AnimalRepo animalRepo;

    @Override
    public ArrayList<CountAnimalsInZoos> getCountAnimalsInZoo() {
        return animalRepo.getCountAnimalsInZoos();
    }
}
