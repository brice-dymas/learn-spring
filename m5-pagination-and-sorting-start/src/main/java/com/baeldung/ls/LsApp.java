package com.baeldung.ls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LsApp {

    public static void main(final String... args) {
        System.out.println("About to run an Interestin App . . .");
        SpringApplication.run(LsApp.class, args);
    }

}
