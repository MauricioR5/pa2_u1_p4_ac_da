package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl1 implements EstudianteRepository { // Impl se refiere a la implementacion de una
																		// interfaz

	private static List<Estudiante> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Estudiante estudiante) {
		baseDatos.add(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) { //busca, encuentra, quita, añade
		Estudiante estu = this.seleccionar(estudiante.getCedula());
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		Estudiante estuEncontrado = new Estudiante();
		for (Estudiante estu : baseDatos) {
			//if(estu.getCedula().equals(cedula)) //si algun elemento es nulo da error NullPointerException
			if (cedula.equals(estu.getCedula())) { //no da nulo (primero evaluamos el que es menos probable que sea nulo)
				estuEncontrado = estu;
			}
		}
		return estuEncontrado;
	}
	@Override
	public void eliminar(String cedula) {
		Estudiante estu = this.seleccionar(cedula);
		baseDatos.remove(estu);
	}

	@Override
	public List<Estudiante> seleccionarTodos() {
		return baseDatos;
	}
	
	

}
