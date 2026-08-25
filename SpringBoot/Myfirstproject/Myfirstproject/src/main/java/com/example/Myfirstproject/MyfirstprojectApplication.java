package com.example.Myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyfirstprojectApplication {

	public static void main(String[] args) {

     ConfigurableApplicationContext context = SpringApplication.run(MyfirstprojectApplication.class, args);

     Alien a = context.getBean(Alien.class);
      Alien b = context.getBean(Alien.class);

     a.show();
     b.show();

	}






}
