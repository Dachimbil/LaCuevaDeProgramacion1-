package controlador;

import modelo.Mundo;
import vista.Interfaz;
import vista.Interfaz;

public class Controlador {

	private Mundo bd;
	private Interfaz gui;
	
	public Controlador() 
	{
		bd = new Mundo();
		gui = new Interfaz();
		
		bd.getSparrow().establecerLlaves(bd.getBD().getCofremagico());
		gui.escribirDato(bd.getSparrow().recibirLlaves(bd.getBD().getCofremagico()));
	}

}
