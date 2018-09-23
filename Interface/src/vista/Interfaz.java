package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public Interfaz()

	{

	}

	public String pedirLadoCuadrado() 
	{
		return (JOptionPane.showInputDialog("Ingrese el lado del cuadrado",null ));
	}

	public String pedirRadioCirculo() 
	{
		return (JOptionPane.showInputDialog("Ingrese el radio del circulo", null));
	}
	public String pedirAltoRectangulo() 
	{
		return (JOptionPane.showInputDialog("Ingrese el alto del rectangulo", null));
	}

	public String pedirAnchoRectangulo() 
	{
		return (JOptionPane.showInputDialog("Ingrese el ancho del rectangulo", null));
	}


	public void ResultadosCirculo(String figura, double area, double perimetro )
	{
		String cadena = "";
		cadena = "El area del circulo es : "+ area + "\n";
		cadena = cadena + "El perimetro del circulo es: "+perimetro + "\n";
		escribirResultado(cadena, figura); 
	}
	public void ResultadosCuadrado(String figura, int area, int perimetro)
	{
		String cadena = "";
		cadena = "El area del cuadrado es : "+ area + "\n";
		cadena = cadena + "El perimetro del cuadrado es : "+perimetro + "\n";
		escribirResultado(cadena, figura); 
	}
	public void ResultadosRectangulo(String figura, int area, int perimetro)
	{
		String cadena = "";
		cadena = "El area del rectangulo es : "+ area + "\n";
		cadena = cadena + "El perimetro del rectangulo es : "+perimetro + "\n";
		escribirResultado(cadena, figura); 
	}



	public void escribirResultado(String dato, String titulo) 
	{
		JOptionPane.showMessageDialog(null, dato, titulo, JOptionPane.INFORMATION_MESSAGE);
	}




}
