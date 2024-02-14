package com.ApacheKafkaProducer;

import com.ApacheKafkaProducer.Model.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@ComponentScan(basePackages = "com.ApacheKafkaProducer")
public class ApacheKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaApplication.class, args);

	}
}
