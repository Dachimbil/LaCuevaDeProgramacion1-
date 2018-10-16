package modelo;

import javax.swing.JOptionPane;

public class Ejercicio_1 
{
	private int x;
	private int y;
	
	public Ejercicio_1()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public String intercambiarNumeros()
	{
		String intercambio = "";
	this.x =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese x"));
	this.y =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese y"));
	
	this.x= this.x + this.y;
	this.y= this.x - this.y;
	this.x= this.x - this.y;
	return intercambio = ("El valor de x ahora es:" + this.x  + "\n" + "El valor de y ahora es:" + this.y);
	
	}

}
