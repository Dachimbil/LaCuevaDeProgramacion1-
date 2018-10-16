package modelo;

import javax.swing.JOptionPane;

public class Ejercicio_2 
{
	private int a,b;

	public Ejercicio_2()
	{
		a = 0;
		b = 0;
	}

	public String Multiplo()
	{
		String multiplo = "";
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo  número"));
		
		if(a % b ==0 || b % a == 0 )
		{
			multiplo = "Los números ingresados son multiplos";
		}
		else 
		{
			multiplo = "Los números ingresados no son multiplos";
			
		}
		return multiplo;

	}

}
