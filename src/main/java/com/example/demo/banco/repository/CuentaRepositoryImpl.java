package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {
	private static List<Cuenta> baseDatos = new ArrayList<>();

	@Override
	public void guardar(Cuenta cuenta) {
		baseDatos.add(cuenta);

	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.borrar(cuenta.getNumero());
		this.guardar(cuenta);

	}

	@Override
	public void borrar(String numero) {
		Cuenta cuenta = this.seleccionarPorNumero(numero);
		baseDatos.remove(cuenta);

	}

	@Override
	public Cuenta seleccionarPorNumero(String numero) {
		Cuenta cuentaEncontrado = new Cuenta();
		for (Cuenta cuenta : baseDatos) {
			// if(estu.getCedula().equals(cedula)) //Maluso
			if (numero.equals(cuenta.getNumero())) { // Primero se pone el elemento que se asegura no es nulo
				cuentaEncontrado = cuenta;
			}
		}
		return cuentaEncontrado;
	}

}
