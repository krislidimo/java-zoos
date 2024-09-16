package com.lambdaschool.javazoos.controller;

import com.lambdaschool.javazoos.repo.ZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zoo")
public class ZooController {
    @Autowired
    private ZooRepo zooRepo;

    @GetMapping(value = "/zoos", produces = {"application/json"})
    public ResponseEntity<?> listAllZoos() {
        return new ResponseEntity<>(zooRepo.findAll(), HttpStatus.OK);
    }
}
