package Modelo;

public class AsistenteSinHabilidad extends Asistente
{
	public AsistenteSinHabilidad(String nombre, int sueldoBase)
	{
		super(nombre, sueldoBase);
		
	}
	
	public AsistenteSinHabilidad()
	{
		
	}
	@Override
	public  float sueldo()
	{
		return sueldoBase;
	}



}
