package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	
	private Agenda cut;

	@BeforeEach
	public void setUp() throws Exception {
		cut = new Agenda();
	}

	@Test
	public void testCreacionDeAlumno() {		
			
		cut.anadirAlumno("Joselito", "Pérez", "76533322K");
		
		Alumno alumno = cut.buscarAlumno("76533322K");
		
		assertEquals("Joselito", alumno.getNombre());
		assertEquals("Pérez", alumno.getApellido());
		assertEquals("76533322K", alumno.getDni());
		
	}
	
	@Test
	public void testBorradoDeAlumno() {
		
		cut.anadirAlumno("Joselito", "Pérez", "76533322K");
		cut.anadirAlumno("Pepito", "Jiménez", "98745423J");
		cut.anadirAlumno("Katarina", "López", "45623497M");
		
		cut.buscarAlumno("98745423J");		
		cut.borrarAlumno("98745423J");
		
		Alumno alumno = cut.buscarAlumno("98745423J");
		
		assertNull(alumno);		
		
		
	}
	
	@Test
	public void testCambioDeNombre() {
		
		cut.anadirAlumno("Joselito", "Pérez", "76533322K");
		cut.anadirAlumno("Pepito", "Jiménez", "98745423J");
		cut.anadirAlumno("Katarina", "López", "45623497M");
		
		cut.modificarNombreAlumno("76533322K", "Jose");
		cut.modificarNombreAlumno("98745423J", "Pepe");
		
		Alumno alumno = cut.buscarAlumno("76533322K");
		Alumno alumno2 = cut.buscarAlumno("98745423J");
		
		assertEquals("Jose", alumno.getNombre());
		assertEquals("Pepe", alumno2.getNombre());	
		
	}
	
	@Test
	public void testCambioDeApellido() {
		
		cut.anadirAlumno("Joselito", "Pérez", "76533322K");
		cut.anadirAlumno("Pepito", "Jiménez", "98745423J");
		cut.anadirAlumno("Katarina", "López", "45623497M");
		
		cut.modificarApellidoAlumno("76533322K", "Perezoso");
		cut.modificarApellidoAlumno("98745423J", "Jimeno");
		
		Alumno alumno = cut.buscarAlumno("76533322K");
		Alumno alumno2 = cut.buscarAlumno("98745423J");
		
		assertEquals("Perezoso", alumno.getApellido());
		assertEquals("Jimeno", alumno2.getApellido());
		
	}
	
	@Test
	public void testCambioDni() {
		
		cut.anadirAlumno("Joselito", "Pérez", "76533322K");
		cut.anadirAlumno("Pepito", "Jiménez", "98745423J");
		cut.anadirAlumno("Katarina", "López", "45623497M");
		
		cut.modificarDniAlumno("76533322K", "11111111K");
		cut.modificarDniAlumno("98745423J", "22222222J");
		
		Alumno alumno = cut.buscarAlumno("11111111K");
		Alumno alumno2 = cut.buscarAlumno("22222222J");
		
		assertEquals("Joselito", alumno.getNombre());
		assertEquals("Jiménez", alumno2.getApellido());
		
	}


}
