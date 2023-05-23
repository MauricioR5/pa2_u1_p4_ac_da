package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;


@Repository
public class EstudianteRepositoryImpl1 implements EstudianteRepository{  // se pone impl en el nombre para identificar que es implementacion

	private static List<Estudiante> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		
		baseDatos.add(estudiante);
		
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		
		Estudiante estu = this.seleccionar(estudiante.getCedula());
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
			}

	@Override
	public Estudiante seleccionar(String cedula) {
		
		Estudiante estuEncontrado = new Estudiante();
		
		for(Estudiante estu : baseDatos) {
			//if(estu.getCedula().equals(cedula))	//Maluso
			if(cedula.equals(estu.getCedula())){ //Primero se pone el elemento que se asegura no es nulo
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
	
	public List<Estudiante> seleccionarTodos(){
		return baseDatos;
	}
}
