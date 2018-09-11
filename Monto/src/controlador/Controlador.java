package controlador;

import Vista.Interfaz;
import modelo.Mundo;

public class Controlador 
{
	private Mundo m;
	private Interfaz v;

	public Controlador()
	{
		v = new Interfaz();
		m = new Mundo();
		m.imprimirNumero();
		m.LeerData();

	}

}
