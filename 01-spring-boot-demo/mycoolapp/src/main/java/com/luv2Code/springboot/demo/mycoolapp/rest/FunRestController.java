package com.luv2Code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

     @GetMapping("/")
    public String getHomePage(){

        return "Hi Dreksha Your Page";
    }
}

//pom.xml means MAVEN PROJECt
//pom.xml is ur shopping list of ur maven project
//POM STRUCTOR
//FIRST
// groupId == CITY
//artifactId=STREET
//VERSION=HOUSE NUM

/*<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>3.0.6</version>*/

//SECOND
//<DEPENDENCIED>
//HIBERNATE,JDBC,JPA

//THIRD PART
//JUNIT External Dependencies