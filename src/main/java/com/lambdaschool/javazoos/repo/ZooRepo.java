package com.lambdaschool.javazoos.repo;

import com.lambdaschool.javazoos.model.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepo extends CrudRepository<Zoo, Long> {
}
