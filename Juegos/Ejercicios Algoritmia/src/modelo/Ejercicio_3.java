package modelo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_3 
{
	private int numero;
	public Ejercicio_3()
	{
		this.numero = numero; 

	}
	public void CantidadCifras()
	{

		numero =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));

		if(numero<10)
			JOptionPane.showMessageDialog(null, "Tiene 1 cifra");  
		else if(numero<100)
			JOptionPane.showMessageDialog(null, "Tiene 2 cifra");  
		else if(numero<1000)
			JOptionPane.showMessageDialog(null, "Tiene 3 cifra");  
		else if(numero<10000)
			JOptionPane.showMessageDialog(null, "Tiene 4 cifra");  

	}



}
