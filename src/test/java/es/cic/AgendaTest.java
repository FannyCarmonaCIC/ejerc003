package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCreacionDeAlumno() {
		
		Agenda cut = new Agenda();	
		cut.anadirAlumno("Joselito", "Pérez", "76533322k");
		
		Alumno alumno = cut.buscarAlumno("76533322k");
		
		assertEquals("Joselito", alumno.getNombre());
		assertEquals("Pérez", alumno.getApellido());
		assertEquals("76533322k", alumno.getDni());
		
	}


}
