package controlador;

import Vista.Interfaz;
import modelo.Credito;

public class Controlador 
{
	private Credito cr;
	private Interfaz in;
	
	public Controlador()
	{
		in = new Interfaz(null);
		cr = new Credito(in.pedirNumCuotas(), in.pedirInteres(),in.pedirInversion());
		in.mostrarTasaEfec(cr.getTasaEfec());
		in.mostrarAnualidad(cr.getValorAnualidad());
		in.mostrarCuota(cr.getValorCuota());

	}

}
