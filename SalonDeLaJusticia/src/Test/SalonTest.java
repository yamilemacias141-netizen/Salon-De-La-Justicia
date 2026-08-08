package Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Asistente;
import Modelo.Superheroe;
import Modelo.Salon;

class SalonTest {

	@Test
	void losQueTienenMasDe3AsistentesTest_valorEsperado() 
	{
		Salon salon = new Salon();
	
		Superheroe s1 = new Superheroe();
		Asistente a1 = new Asistente();
		Asistente a2 = new Asistente();
		Asistente a3 = new Asistente();
		Asistente a4 = new Asistente();
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		s1.agregarAsistente(a3);
		s1.agregarAsistente(a4);
		salon.agregarSuperheroe(s1);
		ArrayList<Superheroe> valorEsperado = new ArrayList<>();
		valorEsperado.add(s1);
		assertEquals(valorEsperado , salon.losQueTienenMasDe3Asistentes());
	}
	

	
	@Test
	void losQueNoLleganAFinDeMesTest_valorEsperado()
	{
		Salon salon = new Salon();
		
		Superheroe s1 = new Superheroe();
		s1.setPresupuestoMensual(22000);
		Asistente a1 = new Asistente();
		a1.setSueldoBase(12000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(12000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		salon.agregarSuperheroe(s1);
		ArrayList<Superheroe> valorEsperado = new ArrayList<>();
		valorEsperado.add(s1);
		
		assertEquals(valorEsperado , salon.losQueNoLleganAFinDeMes());
		
	}
	
	@Test
	void presupuestoInsumosTest_valorEsperado()
	{
        Salon salon = new Salon();
		
		Superheroe s1 = new Superheroe();
		s1.setPresupuestoMensual(30000);
		Asistente a1 = new Asistente();
		a1.setSueldoBase(12000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(12000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		salon.agregarSuperheroe(s1);
		assertEquals(6000, salon.presupuestoInsumos());
		
	}
	
	@Test
	void cantidadAsistentesQueGananMasDe60000Test_valorEsperado()
	{
        Salon salon = new Salon();
		
		Superheroe s1 = new Superheroe();
		
		Asistente a1 = new Asistente();
		a1.setSueldoBase(61000);
		Asistente a2 = new Asistente();
		a2.setSueldoBase(62000);
		
		s1.agregarAsistente(a1);
		s1.agregarAsistente(a2);
		salon.agregarSuperheroe(s1);
		assertEquals(2 , salon.cantidadAsistentesQueGananMasDe60000());
	}

}
