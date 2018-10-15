package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelConsolidado extends JPanel
{
	private  static  final  long serialVersionUID =  1L ;
	private JButton botonConsolidado;
	private JTextArea txtConsolidar;
	public static final String CONSOLIDAR = "Consolidar";
	
	
	
	public PanelConsolidado()
	{
		setLayout(new GridLayout(1,2));
		botonConsolidado =  new  JButton ( "CONSOLIDAR " );
		botonConsolidado.setActionCommand (CONSOLIDAR);
		
		txtConsolidar =  new JTextArea();
		txtConsolidar.setBackground(Color.YELLOW);
		txtConsolidar.setForeground(Color.BLACK);
		
		
		add(botonConsolidado);
		add(txtConsolidar);
		
		
	}


	public JButton getBotonConsolidado() {
		return botonConsolidado;
	}


	public void setBotonConsolidado(JButton botonConsolidado) {
		this.botonConsolidado = botonConsolidado;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getConsolidar() {
		return CONSOLIDAR;
	}


	public JTextArea getTxtConsolidar() {
		return txtConsolidar;
	}


	public void setTxtConsolidar(JTextArea txtConsolidar) {
		this.txtConsolidar = txtConsolidar;
	}

	


}
