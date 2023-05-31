package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante seleccionar(String cedula); // se busca a partir de un identificador

	public void eliminar(String cedula); //se elimina mediante un identificador
	
	public List<Estudiante> seleccionarTodos();

}
