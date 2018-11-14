package io.sstrategy.demo.dls.library.stub;

import org.springframework.stereotype.Component;

import io.sstrategy.demo.dls.library.ConsumerDependentService;

@Component
public class ConsumerDependentServiceStub implements ConsumerDependentService {

	public String truncate(String text) {
		return "stub content";
	}
	
}
