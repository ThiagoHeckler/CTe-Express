package com.cte.emissor;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cte.emissor")
public class EmissorCteApplication{

    public static void main(String[] args) {
        SpringApplication.run(EmissorCteApplication.class, args);
    }

}
