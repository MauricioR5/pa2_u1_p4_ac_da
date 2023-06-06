package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cajero;
import com.example.demo.banco.repository.modelo.Impuesto;
import com.example.demo.banco.repository.modelo.Presidente;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CargaSistemaService;
import com.example.demo.banco.service.TransferenciaService;

@SpringBootApplication
public class Pa2U1P4AcDaApplication implements CommandLineRunner {

	@Autowired
	private Cajero cajero;

	@Autowired
	private Cajero cajero1;

	@Autowired
	private Presidente presidente;

	@Autowired
	private Presidente presidente2;

	@Autowired
	private CargaSistemaService cargaSistemaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.cajero.setApellido("Cacuango");
		this.cajero.setNombre("Mau Dennisse");
		this.cajero.setSalario(new BigDecimal(850));

		this.cajero1.setApellido("Andrade");

		System.out.println(this.cajero);
		System.out.println(this.cajero1);
		System.out.println(this.cajero1.getApellido());

		this.presidente.setApellido("Porras");
		this.presidente.setNombre("Andrea");
		this.presidente.setCedula("cedula");

		this.presidente2.setApellido("Tacones");
		// this.presidente2.setNombre("Andrea");
		// this.presidente2.setCedula("cedula");
		System.out.println(this.presidente);
		System.out.println(this.presidente2);

		System.out.println("*********** Segunda parte del taller *****");

		this.cargaSistemaService.cargar();
		Transferencia transfer = new Transferencia();
		transfer.setCuentaOrigen(null);
		transfer.setCuentaDestino(null);
		transfer.setFechas(LocalDateTime.now());
		transfer.setMonto(new BigDecimal(100));
		transfer.setNumero("12313212313");
		this.transferenciaService.guardar(transfer);
		

	}

}
