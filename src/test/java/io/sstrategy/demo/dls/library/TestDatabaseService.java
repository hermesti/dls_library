package io.sstrategy.demo.dls.library;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.sstrategy.demo.dls.library.model.Animal;
import io.sstrategy.demo.dls.library.model.repo.AnimalRepo;

/**
 * This is an integration test that demonstrates how to test a service that interacts with a database.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestDatabaseService {
	
	@Autowired
	private DatabaseService databaseService;
	
	@Autowired
	private AnimalRepo animalRepo;
	
	@Test
	public void testStoreAnimal() {
		
		// Arrange.
		Animal animal = new Animal();
		animal.setName("Dog");
		
		// Act.
		databaseService.storeAnimal(animal);
		
		// Assert.
		List<Animal> storedAnimals = animalRepo.findAll();
		Assert.assertEquals("An animal should have been stored in database.", 1, storedAnimals.size());
		
	}
}
