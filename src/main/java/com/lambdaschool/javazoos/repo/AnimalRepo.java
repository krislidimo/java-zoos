package com.lambdaschool.javazoos.repo;

import com.lambdaschool.javazoos.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepo extends CrudRepository<Animal, Long> {
}
