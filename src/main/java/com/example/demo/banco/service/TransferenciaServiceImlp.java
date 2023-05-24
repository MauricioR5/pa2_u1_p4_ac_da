package com.example.demo.banco.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImlp implements TransferenciaService{
	private static List<Transferencia> baseDatos = new ArrayList<>();

	@Override
	public void guardar(Transferencia transferencia) {
		baseDatos.add(transferencia);
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.borrar(transferencia.getNumero());
		this.guardar(transferencia);
			
	}

	@Override
	public void borrar(String numero) {
		Transferencia transfer = this.buscarPorNumero(numero);
		baseDatos.remove(transfer);		
	}

	@Override
	public Transferencia buscarPorNumero(String numero) {
		Transferencia transEncontrado = new Transferencia();
		for(Transferencia transfer : baseDatos) {
			//if(estu.getCedula().equals(cedula))	//Maluso
			if(numero.equals(transfer.getNumero())){ //Primero se pone el elemento que se asegura no es nulo
				transEncontrado = transfer;
			}
		}
		return transEncontrado;
	}

}
