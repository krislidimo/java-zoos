package com.lambdaschool.javazoos.repo;

import com.lambdaschool.javazoos.model.Animal;
import com.lambdaschool.javazoos.view.CountAnimalsInZoos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepo extends CrudRepository<Animal, Long> {
    @Query(value = "SELECT za.animalid, a.animaltype, count(za.animalid) as countanimals FROM zooanimal za INNER JOIN animal a on za.animalid=a.animalid GROUP BY za.animalid, a.animaltype", nativeQuery = true)
    ArrayList<CountAnimalsInZoos> getCountAnimalsInZoos();
}
