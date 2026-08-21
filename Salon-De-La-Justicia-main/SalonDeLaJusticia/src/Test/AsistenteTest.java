package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.AsistenteSinHabilidad;


class AsistenteTest 
{
	@Test
	void sueldo_valorEsperado() 
	{
		AsistenteSinHabilidad a1 = new AsistenteSinHabilidad("olaf" , 12000);
		assertEquals(12000, a1.sueldo());
		
	}
	
	@Test
	void sueldoMasDe60000Test_false()
	{
		AsistenteSinHabilidad a1 = new AsistenteSinHabilidad("Olaf" , 12000);
		assertEquals(false , a1.sueldoMasDe60000());
	}



}
