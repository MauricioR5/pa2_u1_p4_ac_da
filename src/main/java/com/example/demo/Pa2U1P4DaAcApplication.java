package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DaAcApplication implements CommandLineRunner { // me permite trabajar con la consola

	@Autowired
	private CuentaService cuentaService;

	@Autowired
	private TransferenciaService transferenciaService;
	@Autowired
	private TransferenciaRepository transferenciaRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DaAcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//cuenta 1
		Cuenta cta01 = new Cuenta();
		cta01.setCedulaPropietario("1726600537");
		cta01.setFechaApertura(LocalDate.now());
		cta01.setNumero("526");
		cta01.setSaldo(new BigDecimal(200));
		cta01.setTipo("A");
		this.cuentaService.guardar(cta01);
		
		//cuenta 2
		Cuenta cta02 = new Cuenta();
		cta02.setCedulaPropietario("1785693458");
		cta02.setFechaApertura(LocalDate.now());
		cta02.setNumero("963");
		cta02.setSaldo(new BigDecimal(100));
		cta02.setTipo("A");
		this.cuentaService.guardar(cta02);
		
		this.transferenciaService.realizar("526", "963", new BigDecimal(10));
	
		System.out.println("Saldo Origen: "+this.cuentaService.buscarPorNumero("526").getSaldo());
		
		System.out.println("Saldo destino: "+this.cuentaService.buscarPorNumero("963").getSaldo());
		
		System.out.println();
		
		List<Transferencia> mov = this.transferenciaRepository.movimientos();
		System.out.println("Reporte de cuenta: ");
		for(Transferencia transfer : mov) {
			System.out.println(transfer);
		}
		
		
		
	}

}
