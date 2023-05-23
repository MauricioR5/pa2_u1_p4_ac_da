package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void registrar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// Buscamos por un identificador
	public Estudiante buscarPorCedula(String cedula);

	// Eliminamos por un identificador
	public void borrar(String cedula);
	
	public List<Estudiante> reporteDeTodos();

}
