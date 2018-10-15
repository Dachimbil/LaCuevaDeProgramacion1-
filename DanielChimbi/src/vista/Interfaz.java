package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class Interfaz extends JFrame
{

	private  static  final  long serialVersionUID =  1L ;
	private PanelConsolidado pc;
	private PanelListadoVentas plv;

	public Interfaz(Controlador control)
	{
		setSize(600,235); 
		setResizable ( false ); 
		setTitle ( "TIENDA GENÉRICA " ); 
		setDefaultCloseOperation ( EXIT_ON_CLOSE ); 
		setLocationRelativeTo ( null ); 

		setLayout ( new BorderLayout());

		pc =  new  PanelConsolidado ();
		add (pc,BorderLayout.NORTH);

		plv =  new  PanelListadoVentas ();
		add (plv,BorderLayout.SOUTH);
		
		pc.getBotonConsolidado(). addActionListener (control);
		plv.getBotonListadoVentas().addActionListener (control);

	}

	public PanelConsolidado getPc() 
	{
		return pc;
	}

	public void setPc(PanelConsolidado pc) 
	{
		this.pc = pc;
	}

	public PanelListadoVentas getPlv() 
	{
		return plv;
	}

	public void setPlv(PanelListadoVentas plv) 
	{

		this.plv = plv;
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	


}



