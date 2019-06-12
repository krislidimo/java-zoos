package com.lambdaschool.javazoos.controller;

import com.lambdaschool.javazoos.model.Zoo;
import com.lambdaschool.javazoos.repo.AnimalRepo;
import com.lambdaschool.javazoos.repo.ZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private ZooRepo zooRepo;

    @PutMapping(value = "/zoos/{id}", produces = {"application/json"})
    public ResponseEntity<?> updateZoo() {

        return new ResponseEntity<>(zooRepo.count(), HttpStatus.OK);
    }

    @PostMapping(value = "/zoos", produces = {"application/json"})
    public ResponseEntity<?> addZoo() {

        return new ResponseEntity<>(zooRepo.count(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/zoos/{id}", produces = {"application/json"})
    public ResponseEntity<?> deleteZoo() {

        return new ResponseEntity<>(zooRepo.count(), HttpStatus.OK);
    }
}
