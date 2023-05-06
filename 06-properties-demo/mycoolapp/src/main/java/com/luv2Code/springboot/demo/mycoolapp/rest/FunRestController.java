package com.luv2Code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    //INJECT PROPERTIES
    @Value("${COUCH.NAME}")
    private String coachName;

    @Value("${TEAM.NAME}")
    private String teamName;


    //Expose "/" return hello world

    @GetMapping("/teamInfo")
    private String getTeamInfo(){
        return "TEAM INFO :"+coachName+" "+teamName;
    }

    @GetMapping("/")
    public String getHomePage() {
        return "Hi Dreksha Your Page";
    }

    @GetMapping("/workout")
    public String getworkout() {
        return "Hi Dreksha Daily workout";
    }

    @GetMapping("/fortune")
    public String getfortune() {
        return "Hi Dreksha today is ur lucky day";
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