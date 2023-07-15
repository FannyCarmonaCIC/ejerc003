package es.cic;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();

	public void anadirAlumno(String nombre, String apellido, String dni) {
		Alumno alumno = new Alumno(nombre, apellido, dni);
		listaDeAlumnos.add(alumno);
	}

	public Alumno buscarAlumno(String dni) {

		Alumno alumno = null;

		for (int i = 0; i < listaDeAlumnos.size(); i++) {
			Alumno alumnoLista = listaDeAlumnos.get(i);
			if (alumnoLista.getDni().equals(dni)) {
				alumno = alumnoLista;
			}
		}
		
		return alumno;
	}
	
	public void borrarAlumno(String dni) {
		
		for (int i = 0; i < listaDeAlumnos.size(); i++) {
			Alumno alumnoLista = listaDeAlumnos.get(i);
			 if (alumnoLista.getDni().equals(dni)) { 
				 listaDeAlumnos.remove(alumnoLista);
				 }
			 
		}
		
	}

}
