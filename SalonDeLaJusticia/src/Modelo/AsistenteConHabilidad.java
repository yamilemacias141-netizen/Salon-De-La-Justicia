package Modelo;

public class AsistenteConHabilidad extends Asistente {

	public AsistenteConHabilidad(String nombre, int sueldoBase)
	{
		super(nombre, sueldoBase);
		
	}

	
	public AsistenteConHabilidad() 
	{
		
	}

    @Override
	public float sueldo()
	{
		return sueldoBase *1.2f;
	}
	


}