package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4AcDaApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Cacuango");
		miEstudiante.setCedula("1723524664");
		miEstudiante.setNombre("Alex");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(1999, 05, 05, 10, 50));

		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Andrade");
		miEstudiante1.setCedula("1751556653");
		miEstudiante1.setNombre("Dennisse");
		miEstudiante1.setFechaNacimiento(LocalDateTime.of(1997, 03, 17, 12, 10));
		// 1. Guardar
		this.estudianteService.registrar(miEstudiante);
		this.estudianteService.registrar(miEstudiante1);

		// 5. Imprimir reporte
		List<Estudiante> reporte = this.estudianteService.reporteDeTodos();
		System.out.println("-----\nReporte de datos de todos los estudiantes");
		for (Estudiante estu : reporte) {
			System.out.println(estu);
		}

		// 2. Actualizar
		miEstudiante1.setApellido("Tarzan");
		this.estudianteService.actualizar(miEstudiante1);

		// 5. Imprimir reporte
		List<Estudiante> reporte2 = this.estudianteService.reporteDeTodos();
		System.out.println("-----\nReporte de datos de todos los estudiantes");
		for (Estudiante estu : reporte2) {
			System.out.println(estu);
		}

		// 3. Eliminar
		this.estudianteService.borrar("1723524664");
		// 5. Imprimir reporte
		List<Estudiante> reporte3 = this.estudianteService.reporteDeTodos();
		System.out.println("-----\nReporte de datos de todos los estudiantes");
		for (Estudiante estu : reporte3) {
			System.out.println(estu);

		}

		// 4. Buscar
		
		System.out.println("------Busqueda por cedula");
		Estudiante busqueda = this.estudianteService.buscarPorCedula("1751556653");
		Estudiante busqueda2 = this.estudianteService.buscarPorCedula("1723524666");
		System.out.println(busqueda);
		System.out.println();
		System.out.println(busqueda2);

	}

}
