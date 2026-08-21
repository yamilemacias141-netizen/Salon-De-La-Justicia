package Modelo;
import java.util.ArrayList;

public class Superheroe 
{
	private String nombre;
	private float presupuestoMensual;
	
	private ArrayList<Asistente> asistentes = new ArrayList<>();
	
	public Superheroe(String nombre , float presupuestoMensual)
	{
		this.nombre=nombre;
		this.presupuestoMensual=presupuestoMensual;
	}
	public Superheroe()
	{
		
	}
	
	public void agregarAsistente(Asistente a)
	{
		asistentes.add(a);
		
	}
	public boolean tieneMasDe3Asistentes()
	{
		if (asistentes.size() > 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public float sueldoAPagar()
	{
		float sueldos = 0;
		for(Asistente s: asistentes)
		{
			sueldos += s.sueldo();
		}
		
		return sueldos;
	}
	public float vaquitaInsumos ()
	{
		float restante = presupuestoMensual - sueldoAPagar();
		return restante;
	}
	
	public boolean llegaAFinDeMes()
	{
		return sueldoAPagar()<= presupuestoMensual;
	}
	
	public int cantidadAsistentesCobranMasDe60000()
	{
		int cantidad = 0;
		for(Asistente a:asistentes)
		{
			if(a.sueldoMasDe60000())
			{
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setPresupuestoMensual(int presupuestoMensual)
	{
		this.presupuestoMensual=presupuestoMensual;
	}


}
