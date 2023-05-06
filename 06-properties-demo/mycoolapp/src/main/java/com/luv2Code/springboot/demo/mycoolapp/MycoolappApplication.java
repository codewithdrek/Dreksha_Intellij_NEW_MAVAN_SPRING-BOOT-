package com.luv2Code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				MycoolappApplication.class, args);
	}

}

//OUTPUT RUN ON BROWSER
//http://localhost:8585/

//afetr addng SECURITY you will recive pass in logs
//Password: 4c0f49ad-f5d6-4d7a-9a2d-17842557ba00
//HIT http://localhost:8585/actuator/mappings : After security jar adding in pom you have to HIT: get http://localhost:8585/actuator/mappings
//password and user name he will ask
//4c0f49ad-f5d6-4d7a-9a2d-17842557ba00