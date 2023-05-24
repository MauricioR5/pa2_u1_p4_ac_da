package com.example.demo.banco.service;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaService {
	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void eliminar(String numero);
	public Cuenta buscarPorNumero(String numero);

}
