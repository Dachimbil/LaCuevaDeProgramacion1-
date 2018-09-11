package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador
{
	private Mundo m;
	private Interfaz i;
	
	public Controlador()
	{
		m =  new Mundo();
		i = new Interfaz();
		
		i.imprimirDatosSeaPlane( m.getSpl().takeOff(), m.getSpl().land(), m.getSpl().fly(), m.getSpl().transportar());
		i.imprimirDatosHelicopter( m.getHe().takeOff(), m.getHe().land(), m.getHe().fly(), m.getHe().transportar());
		i.imprimirDatosBird(m.getBr().comer(),m.getBr().hacerNido(),m.getBr().dejarHuevos(), m.getBr().takeOff(), m.getBr().land(), m.getBr().fly());
		i.imprimirDatosSuperman(m.getSp().takeOff(),m.getSp().land(),m.getSp().fly(),m.getSp().ayudarPersonas(),m.getSp().saltarMuros(),m.getSp().pararBalas(),m.getSp().comer());
	}

}
