package com.lambdaschool.javazoos.repo;

import com.lambdaschool.javazoos.model.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepo extends CrudRepository<Telephone, Long> {
}
