package controlador;

import modelo.Persistencia;

public class Controlador 
{
	private Persistencia Per;
	
	public Controlador()
	{
		Per = new Persistencia();
		
		Per.setPropiedades();
		Per.getPropiedades();
		
	}
	
	

}
