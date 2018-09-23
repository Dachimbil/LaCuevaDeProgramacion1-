package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador
{
	private Mundo m;
	private Interfaz i;
	
	public Controlador()
	{
		m = new Mundo();
		i =  new Interfaz();
		
		i.Resultados();
	}
	
	
	

}
