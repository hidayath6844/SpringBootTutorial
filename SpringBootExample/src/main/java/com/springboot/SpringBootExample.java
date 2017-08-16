package com.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
 */

/**
 * @author Hidayathulla.Khan
 *
 */
@SpringBootApplication  
public class SpringBootExample extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootExample.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootExample.class, args);
}
}
