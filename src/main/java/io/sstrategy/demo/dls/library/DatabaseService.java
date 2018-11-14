package io.sstrategy.demo.dls.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.sstrategy.demo.dls.library.model.Animal;
import io.sstrategy.demo.dls.library.model.repo.AnimalRepo;

/**
 * Example of a service that interacts with a database. 
 */
@Component
public class DatabaseService {

	@Autowired
	private AnimalRepo animalRepo;
	
	public void storeAnimal(Animal animal) {
		animalRepo.save(animal);
	}
	
}
