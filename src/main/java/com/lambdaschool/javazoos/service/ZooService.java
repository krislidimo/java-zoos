package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.model.Zoo;

import java.util.ArrayList;

public interface ZooService {
    ArrayList<Zoo> findAll();

    Zoo update(Zoo zoo, long id);

    Zoo save(Zoo zoo);

    void delete(long id);

}
