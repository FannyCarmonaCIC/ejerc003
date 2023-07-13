package es.cic;

import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();

	public void anadirAlumno(String nombre, String apellido, String dni){
		Alumno alumno = new Alumno(nombre, apellido, dni);
		listaDeAlumnos.add(alumno);
	}
	
	public void borrarAlumno(String dni) {
		
	}
	
	public void modificarNombreAlumno(String nombre) {
		alumno.setNombre(nombre);
	}
	
	public void modificarApellido(String apellido) {
		alumno.setApellido(apellido);
	}
	
	public void modificarDni(String dni) {
		alumno.setDni(dni);
	}
	
}
