package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Persistencia 
{
	private Properties prop;
	private String archivoprop;

	public Persistencia()
	{
		prop = new Properties();
		archivoprop =  "C:\\data\\archivo.properties";
	}

	public void setPropiedades() 
	{
		try 
		{
			prop.setProperty("Color ojos", "Cafes");
			prop.setProperty("Color piel", "Moreno");
			prop.setProperty("Estatura", "1.71");
			prop.setProperty("Alias", "LaMagiaLeón");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}

	}

	public void getPropiedades() {
		try {
			// load a properties file for reading
			prop.load(new FileInputStream(archivoprop));
			// get the properties and print
			prop.list(System.out);
			//Reading each property value
			System.out.println(prop.getProperty("Color ojos"));
			System.out.println(prop.getProperty("Color piel"));
			System.out.println(prop.getProperty("Estatura"));
			System.out.println(prop.getProperty("Alias"));
		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}

	}

}
