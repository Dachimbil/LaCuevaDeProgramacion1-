package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazGui extends JFrame
{
	private  static  final  long serialVersionUID =  1L ;
	private PanelBotones_Resultados resultados;

	public InterfazGui(Controlador control)
	{
		setSize(500,400); 
		setResizable ( false ); 
		setTitle ( "EJERCICIOS DE ALGORITMIA" ); 
		setDefaultCloseOperation ( EXIT_ON_CLOSE ); 
		setLocationRelativeTo ( null ); 

		setLayout ( new BorderLayout());

		resultados =  new  PanelBotones_Resultados();
		add (resultados,BorderLayout.CENTER);
		
		resultados.getBotonIntercambiar().addActionListener(control);
		resultados.getBotonMultiplo().addActionListener(control);
		resultados.getBotonCifras().addActionListener(control);

		
	}

	public PanelBotones_Resultados getResultados() {
		return resultados;
	}

	public void setResultados(PanelBotones_Resultados resultados) {
		this.resultados = resultados;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
