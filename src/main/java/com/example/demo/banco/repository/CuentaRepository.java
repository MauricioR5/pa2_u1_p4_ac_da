package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaRepository {
	public void guardar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void borrar(String numero);
	public Cuenta seleccionarPorNumero(String numero);

}
