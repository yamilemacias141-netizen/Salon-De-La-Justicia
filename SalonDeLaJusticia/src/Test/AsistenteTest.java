package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Asistente;


class AsistenteTest 
{
	@Test
	void sueldo_valorEsperado() 
	{
		Asistente a1 = new Asistente("olaf" , 12000);
		assertEquals(12000, a1.sueldo());
		
	}
	
	@Test
	void sueldoMasDe60000Test_false()
	{
		Asistente a1 = new Asistente("Olaf" , 12000);
		assertEquals(false , a1.sueldoMasDe60000());
	}



}
