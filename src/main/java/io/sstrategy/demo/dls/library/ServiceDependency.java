package io.sstrategy.demo.dls.library;

import org.springframework.stereotype.Component;

@Component
public class ServiceDependency {

	public String uppercase(String text) {
		return text.toUpperCase();
	}
	
}
