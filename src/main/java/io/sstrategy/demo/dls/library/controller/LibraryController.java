package io.sstrategy.demo.dls.library.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.sstrategy.demo.dls.library.ConsumerDependentService;

/**
 * A controller inside a library project.
 * 
 * The dependency of spring-boot-starter-web is required in the library's pom.xml so theese REST annotations can be used.
 */
@RestController
@RequestMapping(value = "/library-controller")
public class LibraryController {
	
	@Autowired
	private ConsumerDependentService consumerDependentService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "text/html; charset=UTF-8")
	public String get(
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
		return "<h1>It's the LibraryController here!</h1>";
	}
	
	@RequestMapping(value = "/consumer-dependency", method = RequestMethod.GET, produces = "text/html; charset=UTF-8")
	public String getConsumerDependency(
			HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
		return "I'm using a dependency that does not exist in my own project: " + consumerDependentService.truncate("longword") ;
	}
	
}
