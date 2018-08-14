package modelo;

import javax.swing.JOptionPane;

public class Mundo 
{
	private int a;
	private int b;
	private int c;
	private double raiz;

	public Mundo()
	{
		a = 0;
		b = 0;
		c = 0;
		raiz = 0.0;
	}

	public void formula() throws DividirEnCero, RaizNegativa
	{
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b"));
		c  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c"));
		raiz = Math.pow(b,2) - (4*a*c);

		if(raiz<=0)
		{
			throw new RaizNegativa();
		}
		else if(a == 0)
		{
			throw new DividirEnCero();
		}
		else if(raiz > 0)
		{
			double x1 = ((b*(-1)) + Math.sqrt(raiz)) / (2*a);
			double x2 = ((b*(-1)) - Math.sqrt(raiz)) / (2*a);
			System.out.println("El valor de x1 es = " + x1 + " y el valor de x2 es ="+ x2);

		}

	}



}
