package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.repo.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "animalService")
public class AnimalServiceImpl {
    @Autowired
    private AnimalRepo animalrepo;
}
