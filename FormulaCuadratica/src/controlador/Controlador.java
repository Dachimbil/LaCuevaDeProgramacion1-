package controlador;

import modelo.Mundo;

public class Controlador 
{
	private Mundo mundo;
	
	public Controlador() throws Exception
	{
		mundo = new Mundo();
		mundo.formula();
	}

}
