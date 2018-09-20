package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Codigo de Honor Pirata", JOptionPane.INFORMATION_MESSAGE);
	}
}
