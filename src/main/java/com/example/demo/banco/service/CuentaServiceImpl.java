package com.example.demo.banco.service;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService {
	private CuentaRepository cuentaRepository;

	@Override
	public void insertar(Cuenta cuenta) {
		this.cuentaRepository.guardar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		this.cuentaRepository.borrar(numero);
	}

	@Override
	public Cuenta buscarPorNumero(String numero) {
		return this.cuentaRepository.seleccionarPorNumero(numero);
	}

}
