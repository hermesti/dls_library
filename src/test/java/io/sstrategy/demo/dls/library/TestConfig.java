package io.sstrategy.demo.dls.library;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
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

	@Value("${connection.driver}")
	private String connectionDriver;
	
	@Value("${connection.url}")
	private String connectionUrl;

	@Value("${connection.username}")
	private String connectionUsername;
	
	@Value("${connection.password}")
	private String connectionPassword;
	
	
	/**
	 * Define el Data Source a usar en los tests. 
	 * 
	 * Esta definición de un Data Source no es necesaria si se quiere dejar que Spring utilice su Data Source por defecto
	 * en los tests anotados con @SpringBootTest. El Data Source por defecto es una base de datos m2. Se incluye
	 * en este proyecto para demostrar cómo sobreescribir ese Data Source por defecto.
	 */
	@Bean
    public DataSource dataSource() {
    	
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(connectionDriver);
        dataSource.setUrl(connectionUrl);
        dataSource.setUsername(connectionUsername);
        dataSource.setPassword(connectionPassword);
        
        return dataSource;
    }
}