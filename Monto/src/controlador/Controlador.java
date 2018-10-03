package controlador;

import Vista.InterfazGUI;
import modelo.Mundo;

public class Controlador 
{
	private Mundo m;
	private InterfazGUI v;

	public Controlador()
	{
		v = new InterfazGUI();
		m = new Mundo();
		
		v.setVisible(true);
	}

}
