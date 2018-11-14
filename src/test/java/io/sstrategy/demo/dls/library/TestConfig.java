package io.sstrategy.demo.dls.library;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/*
 * La anotación SpringBootConfiguration convierte esta clase en la configuración por defecto para
 * todos los tests. Es un sustituto de la anotación SpringBootApplication cuando no se quiere crear
 * una aplicación.
 * Ver https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringBootConfiguration.html
 */

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = "io.sstrategy")
public class TestConfig {


}