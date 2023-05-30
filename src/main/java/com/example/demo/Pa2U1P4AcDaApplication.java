package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4AcDaApplication implements CommandLineRunner {

	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cuenta cta1 = new Cuenta();
		cta1.setCedulaPropietario("1234");
		cta1.setFechaApertura(LocalDate.now());
		cta1.setNumero("5678");
		cta1.setSaldo(new BigDecimal(200));
		cta1.setTipo("A");

		this.cuentaService.insertar(cta1);
		
		Cuenta cta2 = new Cuenta();
		cta2.setCedulaPropietario("0987");
		cta2.setFechaApertura(LocalDate.now());
		cta2.setNumero("7894");
		cta2.setSaldo(new BigDecimal(100));
		cta2.setTipo("A");

		this.cuentaService.insertar(cta2);
		
		this.transferenciaService.realizar("5678", "7894", new BigDecimal(10));
		System.out.println("Saldo Origen: " + this.cuentaService.buscarPorNumero("5678").getSaldo());
		System.out.println("Saldo Destino: "+ this.cuentaService.buscarPorNumero("7894").getSaldo());
		
		

		

	}

}
