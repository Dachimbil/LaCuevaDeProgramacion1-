package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelBotones_Resultados extends JPanel  
{
	private  static  final  long serialVersionUID =  1L ;
	private JButton botonIntercambiar, botonMultiplo,botonCifras;
	private JTextArea resulIntercambiar, resulMultiplo,resulCifras;
	public static final String INTERCAMBIAR = "Intercambiar";
	public static final String MULTIPLO = "Multiplo";
	public static final String CIFRAS= "Cifras";
	
	public PanelBotones_Resultados()
	{
		setLayout(new GridLayout(3,2));
		
		botonIntercambiar =  new  JButton ( "INTERCAMBIO" );
		botonIntercambiar.setActionCommand (INTERCAMBIAR);
		
		resulIntercambiar =  new JTextArea();
		resulIntercambiar.setBackground(Color.YELLOW);
		resulIntercambiar.setForeground(Color.BLACK);
		
		botonMultiplo =  new  JButton ( "MULTIPLO" );
		botonMultiplo.setActionCommand (MULTIPLO);
		
		resulMultiplo =  new JTextArea();
		resulMultiplo.setBackground(Color.BLUE);
		resulMultiplo.setForeground(Color.WHITE);
		
		botonCifras =  new  JButton ( "CIFRAS" );
		botonCifras.setActionCommand (CIFRAS);
		
		resulCifras =  new JTextArea();
		resulCifras.setBackground(Color.RED);
		resulCifras.setForeground(Color.WHITE);
		
		
		add(botonIntercambiar);
		add(resulIntercambiar);
		add(botonMultiplo);
		add(resulMultiplo);
		add(botonCifras);
		add(resulCifras);
	}

	public JButton getBotonIntercambiar() {
		return botonIntercambiar;
	}

	public void setBotonIntercambiar(JButton botonIntercambiar) {
		this.botonIntercambiar = botonIntercambiar;
	}

	public JButton getBotonMultiplo() {
		return botonMultiplo;
	}

	public void setBotonMultiplo(JButton botonMultiplo) {
		this.botonMultiplo = botonMultiplo;
	}

	public JButton getBotonCifras() {
		return botonCifras;
	}

	public void setBotonCifras(JButton botonCifras) {
		this.botonCifras = botonCifras;
	}

	public JTextArea getResulIntercambiar() {
		return resulIntercambiar;
	}

	public void setResulIntercambiar(JTextArea resulIntercambiar) {
		this.resulIntercambiar = resulIntercambiar;
	}

	public JTextArea getResulMultiplo() {
		return resulMultiplo;
	}

	public void setResulMultiplo(JTextArea resulMultiplo) {
		this.resulMultiplo = resulMultiplo;
	}

	public JTextArea getResulCifras() {
		return resulCifras;
	}

	public void setResulCifras(JTextArea resulCifras) {
		this.resulCifras = resulCifras;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getIntercambiar() {
		return INTERCAMBIAR;
	}

	public static String getMultiplo() {
		return MULTIPLO;
	}

	public static String getCifras() {
		return CIFRAS;
	}

}
