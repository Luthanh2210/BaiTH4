package com.codegym.spring.mvc.hibernate.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringMvcHibernateCrudApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcHibernateCrudApp.class, args);
	}

}
