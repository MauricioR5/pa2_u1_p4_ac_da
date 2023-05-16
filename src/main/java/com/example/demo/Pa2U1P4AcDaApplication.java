package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4AcDaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto");
		/*Spring framework: Framework que permite la construcción/desarrollo 
		 * de aplicaciones empresariales basadas en Spring*/
	Profesor profe = new Profesor();
	profe.setNombre("Andrade");
	profe.setApellido("Dennisse");
	profe.setCedula("1751556653");
	profe.setFechaNacimiento(LocalDateTime.now());
	
	Profesor profe2 = new Profesor();
	profe2.setNombre("Mauricio");
	profe2.setApellido("Cacuango");
	profe2.setCedula("1723524664");
	profe2.setFechaNacimiento(LocalDateTime.now());
	
	System.out.println(profe);
	System.out.println(profe2);
	}

}
