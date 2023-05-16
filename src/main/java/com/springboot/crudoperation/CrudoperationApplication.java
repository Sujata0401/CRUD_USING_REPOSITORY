package com.springboot.crudoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
//SpringBootServletInitializer vayena vani tomcat server ma chaldaina
//tomcat on top of servlet chalcha
public class CrudoperationApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(CrudoperationApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(CrudoperationApplication.class, args);
	}

}
