package com.lambdaschool.javazoos.controller;

import com.lambdaschool.javazoos.model.Zoo;
import com.lambdaschool.javazoos.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private ZooService zooService;

    @PutMapping(value = "/zoos/{id}", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<?> updateZoo(@PathVariable long id, @RequestBody Zoo updateZoo) {
        zooService.update(updateZoo, id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @PostMapping(value = "/zoos", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<?> addZoo(HttpServletRequest request, @Valid @RequestBody Zoo newZoo) throws URISyntaxException {
        newZoo = zooService.save(newZoo);
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newRestaurantURI = ServletUriComponentsBuilder.fromUriString(request.getServerName() + ":" + request.getLocalPort() + "/zoos/zoos/{zooid}").buildAndExpand(newZoo.getZooid()).toUri();
        responseHeaders.setLocation(newRestaurantURI);

        return new ResponseEntity<>( null, responseHeaders, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/zoos/{id}", produces = {"application/json"})
    public ResponseEntity<?> deleteZoo(@PathVariable long id) {
        zooService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
