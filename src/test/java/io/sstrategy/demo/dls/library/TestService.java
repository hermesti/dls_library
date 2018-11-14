package io.sstrategy.demo.dls.library;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This demonstrates how to create a test for a library class, even if that class has dependencies
 * that are injected by Autowired annotations.
 * 
 * The subject under test, Service, depends on a class called ServiceDependency. This test checks
 * the behavior of both, the Service class and its dependency, working together.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
	
	@Autowired
	private Service service;
	
	@Test
	public void testGetMessage() {
		
		Assert.assertEquals(
				"Should return the expected uppercase sentence.", 
				"THIS IS A SERVICE CLASS MESSAGE.", 
				service.getMessage());
	}
}
