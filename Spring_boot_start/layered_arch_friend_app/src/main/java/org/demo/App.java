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
        System.out.println( "welcome to java App" );
        SpringApplication.run(App.class,args);
        System.err.println( "welcome to spring App" );
    }
}
