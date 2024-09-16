package com.lambdaschool.javazoos.repo;

import com.lambdaschool.javazoos.model.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepo extends CrudRepository<Zoo, Long> {

    @Modifying
    @Query(value = "DELETE FROM zooanimal WHERE zooid = :zooid", nativeQuery = true)
    void deleteZooFromZooanimal(long zooid);

}
