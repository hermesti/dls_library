package io.sstrategy.demo.dls.library.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.sstrategy.demo.dls.library.model.Animal;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {

}
