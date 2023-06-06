package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.ImpuestoRepository;
import com.example.demo.banco.repository.modelo.Impuesto;

@Service
public class CargaSistemaServiceImpl implements CargaSistemaService {

	@Autowired
	private ImpuestoRepository impuestoRepository;

	@Autowired
	private Impuesto impuesto;
	
	@Override
	public void cargar() {
		System.out.println("Inicia carga de impuestos... ");
		BigDecimal valorIva = this.impuestoRepository.seleccionar("IVA");
		this.impuesto.setIva(valorIva);
		System.out.println("Fin de carga de impuestos. ");

	}

}
