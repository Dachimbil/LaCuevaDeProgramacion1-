package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Pirata 
{
	
	private String llave;
	private String palabra;
	private Properties codigohonor; 
	
	public Pirata() 
	{
		this.llave = "xxx";
		this.palabra = "yes";
		this.codigohonor = new Properties();
	}
	public void establecerLlaves(String cofrecerrado) 
	{
		codigohonor.setProperty("hermandad", "barbosa");
		codigohonor.setProperty("enemistad", "salazar");
		try {
			codigohonor.store(new FileOutputStream(cofrecerrado), null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String recibirLlaves(String cofreabierto) 
	{
		try {
			codigohonor.load(new FileInputStream(cofreabierto));
			this.llave = codigohonor.getProperty("hermandad");
			this.palabra = codigohonor.getProperty("enemistad");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.llave + "  " + this.palabra;
	}
}

