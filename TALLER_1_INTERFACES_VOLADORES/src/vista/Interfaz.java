package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public Interfaz()
	{
		
	}
	
	public void imprimirDatosSeaPlane(String takeoff, String land, String fly, String transportar)
	{
		String cadena = "";
		cadena = "El hidroavión "+ takeoff + "\n";
		cadena = cadena + "Este "+land + "\n";
		cadena = cadena + "También "+fly + "\n";
		cadena = cadena + "Y sirve para "+transportar + "\n";
		escribirResultadoSpl(cadena); 
	}
	
	public void escribirResultadoSpl(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "HIDROAVIÓN", JOptionPane.INFORMATION_MESSAGE);
	}

	
	public void imprimirDatosHelicopter(String takeoff, String land, String fly, String transportar)
	{
		String cadena = "";
		cadena = "El helicoptero "+ takeoff + "\n";
		cadena = cadena + "Este "+land + "\n";
		cadena = cadena + "Tambien "+fly + "\n";
		cadena = cadena + "Y sirve para "+transportar + "\n";
		escribirResultadoHe(cadena); 
	}
	
	
	public void escribirResultadoHe(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "HELICOPTERO", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void imprimirDatosBird(String comer, String nido,String huevos,String takeoff, String land, String fly)
	{
		String cadena = "";
		cadena = "Una paloma"+ comer + "\n";
		cadena = cadena + "Esta hace"+nido + "\n";
		cadena = cadena + "Ya que las crias"+huevos + "\n";
		cadena = cadena + "Tambien"+takeoff + "\n";
		cadena = cadena + "Esta"+land + "\n";
		cadena = cadena + "Y"+fly + "\n";
		escribirResultadoBr(cadena); 
	}
	
	public void escribirResultadoBr(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "PALOMA", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void imprimirDatosSuperman(String takeoff, String land, String fly, String ayudar, String saltarMuros, String pararBalas, String comer )
	{
		String cadena = "";
		cadena = "SuperMan puede"+ takeoff + "\n";
		cadena = cadena + "Este"+land + "\n";
		cadena = cadena + "También"+fly + "\n";
		cadena = cadena + "Su misión en la vida es"+ayudar + "\n";
		cadena = cadena + "Puede"+saltarMuros + "\n";
		cadena = cadena + "También puede "+pararBalas + "\n";
		cadena = cadena + "Y"+comer+" para estar saludable "+ "\n";
		escribirResultadoSp(cadena); 
	}
	public void escribirResultadoSp(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "SUPERMAN", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	


}
