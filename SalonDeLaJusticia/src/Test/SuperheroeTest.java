package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Asistente;
import Modelo.AsistenteConHabilidad;
import Modelo.Superheroe;

class SuperheroeTest 
{
	@Test
	void tieneMasDe3AsistentesTest_false() 
	{
		Superheroe s1 = new Superheroe ();
		Asistente a1 = new Asistente();
		AsistenteConHabilidad a2 = new AsistenteConHabilidad();
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		
		assertEquals (false , s1.tieneMasDe3Asistentes() );
	}
	
	@Test
	void sueldoAPagarTest_240000()
	{
		Superheroe s1 = new Superheroe();
		Asistente a1 = new Asistente();
		a1.setSueldoBase(12000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(12000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		
		assertEquals(24000 , s1.sueldoAPagar());
	
	}
	
	@Test
	void vaquitaInsumosTest_6000()
	{
		Superheroe s1 = new Superheroe();
		s1.setPresupuestoMensual(30000);
		Asistente a1 = new Asistente();
		a1.setSueldoBase(12000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(12000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		
		assertEquals(6000 , s1.vaquitaInsumos());
	}
	
	@Test
	void llegaAFinDeMesTest_true()
	{
		Superheroe s1 = new Superheroe();
		s1.setPresupuestoMensual(30000);
		Asistente a1 = new Asistente();
		a1.setSueldoBase(12000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(12000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		
		assertEquals(true , s1.llegaAFinDeMes());
	}
	
	@Test
	void cantidadAsistentesCobranMasDe60000Test_1()
	{
		Superheroe s1 = new Superheroe();
		s1.setPresupuestoMensual(30000);
		AsistenteConHabilidad a1 = new AsistenteConHabilidad();
		a1.setSueldoBase(60000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(12000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		
		assertEquals(1 , s1.cantidadAsistentesCobranMasDe60000());
	}
	


	
}
