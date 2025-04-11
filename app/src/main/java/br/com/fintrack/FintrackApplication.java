package br.com.fintrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.fintrack")
public class FintrackApplication {
    public static void main(String[] args) {
        SpringApplication.run(FintrackApplication.class, args);
    }
}
