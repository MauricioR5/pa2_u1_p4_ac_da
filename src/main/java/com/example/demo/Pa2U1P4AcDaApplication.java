package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4AcDaApplication implements CommandLineRunner {
	@Autowired // anotación que inyecta 
	private Profesor profe3;
	
	
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
	profe.setNombre("Dennisse");
	profe.setApellido("Andrade");
	profe.setCedula("1751556653");
	profe.setFechaNacimiento(LocalDateTime.now());
	
	Profesor profe2 = new Profesor();
	profe2.setNombre("Mauricio");
	profe2.setApellido("Cacuango");
	profe2.setCedula("1723524664");
	profe2.setFechaNacimiento(LocalDateTime.now());
	
	System.out.println(profe);
	System.out.println(profe2);
	
//	profe3 = new Profesor();
	
	profe3.setNombre("O ");
	profe3.setApellido("Campana");
	
	
	System.out.println(profe3);
	System.out.println(profe3.getNombre());
	System.out.println(profe3.getApellido());
	
	Profesor profe4;
	profe4 = profe;
	System.out.println(profe4);
	profe.setApellido("Tilin tilin");
	System.out.println(profe4);
	profe4.setApellido("Quinaucho");
	System.out.println(profe);
	
	MatriculaCalculo mat = new MatriculaCalculo();
	
	mat.realizarMatricula("1");


	
	}

}
