package com.upgrad.course.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Customer Api to handle customer related requests
 *
 */
@SpringBootApplication
public class CustomerApiMain {
    public static void main( String[] args ) {
        SpringApplication.run(CustomerApiMain.class, args);
    }
}
