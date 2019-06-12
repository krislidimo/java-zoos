package com.lambdaschool.javazoos.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long animalid;

    private String animaltype;

    @ManyToMany(mappedBy = "animals")
    private List<Zoo> zoos= new ArrayList<>();

    public Animal(String animaltype) {
        this.animaltype = animaltype;
    }

    public Animal() {
    }

    public Long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(Long animalid) {
        this.animalid = animalid;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public List<Zoo> getZoos() {
        return zoos;
    }

    public void setZoos(List<Zoo> zoos) {
        this.zoos = zoos;
    }


}
