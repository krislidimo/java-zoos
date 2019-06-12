package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.model.Animal;
import com.lambdaschool.javazoos.view.CountAnimalsInZoos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface AnimalService {
    ArrayList<CountAnimalsInZoos> getCountAnimalsInZoo();
}
