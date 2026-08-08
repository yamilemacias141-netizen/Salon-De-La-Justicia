package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.AsistenteConHabilidad;

class AsistenteConHabilidadTest {

	@Test
	void sueldoTest_valorEsperado() 
	{
		AsistenteConHabilidad a1= new  AsistenteConHabilidad("olaf" , 12000);
		assertEquals(14400, a1.sueldo());
	}

}
