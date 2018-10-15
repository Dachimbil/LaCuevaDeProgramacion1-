package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador implements ActionListener
{

	private Mundo m;	
	private Interfaz gui;

	public Controlador() throws IOException
	{
		m = new Mundo();
		gui = new Interfaz(this);
		gui.setVisible(true);

		m.getConfig().getPropiedades();

		m.getVentas().leerArchivoProductos(m.getConfig().getArchivoProducto());

		m.getVentas().leerArchivoDetalleVentas(m.getConfig().getArchivoDetalleVenta());

		m.getVentas().consolidarVentas(m.getConfig().getIVA());

	}

	public  void  actionPerformed ( ActionEvent  evento ) 
	{
		if(evento.getActionCommand().equals(gui.getPc().CONSOLIDAR))
		{
			gui.getPc().getTxtConsolidar().setText(m.getVentas().generarReporteVentas());		
			
		}
		else if(evento.getActionCommand().equals(gui.getPlv().VENTAS))
		{
			gui.getPlv().getTxtListadoVentas().setText(m.getVentas().generarReporteXProducto());		
			
			
		}
		
		
		
	}

}
