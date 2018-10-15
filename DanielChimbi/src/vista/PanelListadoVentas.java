package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelListadoVentas extends JPanel
{
	private  static  final  long serialVersionUID =  1L ;
	private JButton botonListadoVentas;
	private JTextArea txtListadoVentas;
	public static final String VENTAS = "Ventas";

	
	public PanelListadoVentas() 
	{
		setLayout(new GridLayout(1,2));
		botonListadoVentas =  new  JButton ( "LISTADO DE VENTAS POR PRODUCTO" );
		botonListadoVentas.setActionCommand (VENTAS);
		
		txtListadoVentas =  new JTextArea();
		txtListadoVentas.setBackground(Color.BLUE);
		txtListadoVentas.setForeground(Color.WHITE);
		
		add(botonListadoVentas);
		add(txtListadoVentas);
		
		
	}

	public JButton getBotonListadoVentas() {
		return botonListadoVentas;
	}

	public void setBotonListadoVentas(JButton botonListadoVentas) {
		this.botonListadoVentas = botonListadoVentas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getVentas() {
		return VENTAS;
	}

	public JTextArea getTxtListadoVentas() {
		return txtListadoVentas;
	}

	public void setTxtListadoVentas(JTextArea txtListadoVentas) {
		this.txtListadoVentas = txtListadoVentas;
	}

	



}
