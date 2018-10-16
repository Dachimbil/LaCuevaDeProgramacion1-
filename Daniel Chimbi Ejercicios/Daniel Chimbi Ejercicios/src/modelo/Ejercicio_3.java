package modelo;

import javax.swing.JOptionPane;

public class Ejercicio_3 
{
	private int n;

	public Ejercicio_3()
	{
		n = 0;
	}

	public String cifras()
	{
		String cifras = "";

		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 0 al 9999"));

		if(n < 10)
		{
			cifras = "El número tiene 1 cifras";
		}
		else if(n < 100)
		{
			cifras = "El número tiene 2 cifras";
		}
		else if(n < 1000)
		{
			cifras = "El número tiene 3 cifras";
		}
		else if( n < 10000)
		{
			cifras = "El número tiene 4 cifras";
		}
		return cifras;
	}

}
