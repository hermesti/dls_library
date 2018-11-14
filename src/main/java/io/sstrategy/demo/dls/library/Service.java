package io.sstrategy.demo.dls.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Example of a service that uses an autowired dependency.
 */
@Component
public class Service {

	@Autowired
	ServiceDependency serviceDependency;
	
	public String getMessage() {
		return serviceDependency.uppercase("This is a service class message.");
	}
	
}
