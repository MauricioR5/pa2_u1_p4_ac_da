package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {
	public void guardar(Transferencia cuenta);

	public void actualizar(Transferencia cuenta);

	public void borrar(String numero);

	public Transferencia buscarPorNumero(String numero);

	public void realizar(String numeroCtaOrigen, String numeroCtaDestino, BigDecimal monto);

	
}
