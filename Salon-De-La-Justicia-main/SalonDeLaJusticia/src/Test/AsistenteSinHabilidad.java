package Test;

import Modelo.Asistente;

public class AsistenteSinHabilidad extends Asistente
{
	public AsistenteSinHabilidad(String nombre, int sueldoBase)
	{
		super(nombre, sueldoBase);
		
	}
	
	public float sueldo()
	{
		return sueldoBase;
	}

}
