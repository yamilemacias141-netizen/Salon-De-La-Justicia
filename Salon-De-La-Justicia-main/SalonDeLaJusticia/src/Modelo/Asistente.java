package Modelo;

public abstract class  Asistente 
{
	private String nombre ;
	protected int sueldoBase;
	
	public Asistente(String nombre , int sueldoBase)
	{
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
		
	}
	
	public Asistente()
	{
		
	}
	
	public abstract float sueldo();
	
	
	public boolean sueldoMasDe60000()
	{
		return sueldo() > 60000;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setSueldoBase(int sueldoBase)
	{
		this.sueldoBase=sueldoBase;
	}

}