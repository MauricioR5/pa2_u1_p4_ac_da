package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void registrar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscarCedula(String cedula); // se busca a partir de un identificador

	public void borrar(String cedula); //se elimina mediante un identificador
	
	public List<Estudiante> reporteDeTodos();
}
