package com.lambdaschool.javazoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.lambdaschool.javazoos.view.View;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(View.AnimalsOnly.class)
    private Long animalid;

    @JsonView(View.AnimalsOnly.class)
    private String animaltype;

    @ManyToMany(mappedBy = "animals")
    @JsonIgnoreProperties("animals")
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
