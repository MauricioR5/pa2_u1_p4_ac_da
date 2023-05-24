package com.example.demo.banco.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService {
	private static List<Cuenta> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Cuenta cuenta) {
		baseDatos.add(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.eliminar(cuenta.getNumero());
		this.insertar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		Cuenta cuenta = this.buscarPorNumero(numero);
		baseDatos.remove(cuenta);
	}

	@Override
	public Cuenta buscarPorNumero(String numero) {
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
