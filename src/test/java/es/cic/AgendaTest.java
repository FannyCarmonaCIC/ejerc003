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
	public void testEdicionNombreDeAlumno() {
		
		cut.anadirAlumno("Joselito", "Pérez", "76533322K");
		cut.anadirAlumno("Pepito", "Jiménez", "98745423J");
		cut.anadirAlumno("Katarina", "López", "45623497M");
		
		cut.modificarNombreAlumno("76533322K", "Jose");
		
		Alumno alumno = cut.buscarAlumno("76533322K");
		
		assertEquals("Jose", alumno.getNombre());	
		
	}


}
