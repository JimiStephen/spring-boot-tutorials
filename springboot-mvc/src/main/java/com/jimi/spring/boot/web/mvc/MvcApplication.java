package com.jimi.spring.boot.web.mvc;

import com.jimi.spring.boot.web.mvc.jpetstore.services.inter.PetStoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

		// retrieve configured instance
		PetStoreService service = context.getBean("petStore", PetStoreService.class);

		// use configured instance
		List<String> userList = service.getUsernameList();
		SpringApplication.run(MvcApplication.class, args);
	}
}
