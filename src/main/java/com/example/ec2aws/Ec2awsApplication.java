package com.example.ec2aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ec2awsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2awsApplication.class, args);
	}

  @GetMapping("/")
  public String hello() {
    return String.format("Hello EC2!");
  }
}
