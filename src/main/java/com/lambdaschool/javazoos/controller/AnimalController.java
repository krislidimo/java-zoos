package com.lambdaschool.javazoos.controller;

import com.lambdaschool.javazoos.repo.AnimalRepo;
import com.lambdaschool.javazoos.service.AnimalService;
import com.lambdaschool.javazoos.service.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {

    @Autowired
    private AnimalServiceImpl animalService;

    @GetMapping(value = "/count", produces = {"application/json"})
    public ResponseEntity<?> animalCount() {

        return new ResponseEntity<>(animalService.getCountAnimalsInZoo(), HttpStatus.OK);
    }
}
