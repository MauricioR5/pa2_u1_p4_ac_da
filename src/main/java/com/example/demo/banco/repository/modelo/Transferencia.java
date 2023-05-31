package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transferencia {	
	private String numero;
	private BigDecimal monto;
	private LocalDateTime fechas;
	private Cuenta cuentaOrigen;
	private Cuenta cuentaDestino;
	
//getters y setters	
	
	@Override
	public String toString() {
		return "Transferencia [numero=" + numero + ", monto=" + monto + ", fechas=" + fechas + ", cuentaOrigen="
				+ cuentaOrigen + ", cuentaDestino=" + cuentaDestino + "]";
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public LocalDateTime getFechas() {
		return fechas;
	}
	public void setFechas(LocalDateTime fechas) {
		this.fechas = fechas;
	}
	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	
	
	
}
