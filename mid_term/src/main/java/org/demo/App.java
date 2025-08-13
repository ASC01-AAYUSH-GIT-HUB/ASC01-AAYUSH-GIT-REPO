package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        System.err.println("code is started");
        SpringApplication.run(App.class,args);
        System.err.println("everything is fine");
    }
}
