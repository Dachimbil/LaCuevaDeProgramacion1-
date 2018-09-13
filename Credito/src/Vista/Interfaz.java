package Vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	private Tabla tabla;

	public Interfaz(Tabla tabla)
	{
		this.tabla = tabla;
		
	}
	
	public int pedirNumCuotas()
	{
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuotas"));	
	}
	
	public double pedirInteres()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes"));
	}
	
	public double pedirInversion()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la inversión"));
	}
	
	public void mostrarTasaEfec(double pTE)
	{
		JOptionPane.showMessageDialog(null, "La tasa Efectiva es "+pTE);
	}
	public void mostrarAnualidad(double pA)
	{
		JOptionPane.showMessageDialog(null, "La anualidad es "+pA);
	}
	public void mostrarCuota(double pC)
	{
		JOptionPane.showMessageDialog(null, "El valor de la cuota es "+pC);
	}
	
	
	
	

}
