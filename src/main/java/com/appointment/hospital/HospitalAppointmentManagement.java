package com.appointment.hospital;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "com.appointment")
@EnableJpaRepositories("com.appointment.hospital.repository")
@EntityScan("com.appointment.hospital.model")
public class HospitalAppointmentManagement implements CommandLineRunner {

	public static void main(String[] args) 
	{
		SpringApplication.run(HospitalAppointmentManagement.class, args);   
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Application is loaded successfully..");
	}
}