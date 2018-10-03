package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Mundo
{

	private ArrayList<String> cadena;
	private File f;

	public Mundo()
	{
		cadena = new ArrayList<>();
		f= new File("‪C:\\Monto\\MontoEscrito.txt");
	}

	public String deNumeroALetra (int pNum)
	{

		String numLetras = "";

		if(16<=pNum && pNum<=19)
		{
			numLetras = "Dieci";

			if (pNum%10  == 6)
				numLetras = numLetras + "Seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "Siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "Ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "Nueve euros";	
		}
		else if(20<pNum && pNum<=29)
		{
			numLetras = "Veinti";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";

		}

		else if(30<pNum && pNum<=39)
		{
			numLetras = "Treinta y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";

		}
		else if(40<pNum && pNum<=49)
		{
			numLetras = "Cuarenta y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros ";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";
		}
		else if(50<pNum && pNum<=59)
		{
			numLetras = "Cincuenta y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";
		}
		else if(60<pNum && pNum<=69)
		{
			numLetras = "Sesenta y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros ";
			else if (pNum%10  == 2)
				numLetras = numLetras + "doseuros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";
		}
		else if(70<pNum && pNum<=79)
		{
			numLetras = "Setenta y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";
		}
		else if(80<pNum && pNum<=89)
		{
			numLetras = "Ochenta y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4)
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";
		}
		else if(90<pNum && pNum<=99)
		{
			numLetras = "Noventa y ";

			if(pNum%10 == 1)
				numLetras = numLetras + "uno euros";
			else if (pNum%10  == 2)
				numLetras = numLetras + "dos euros";
			else if (pNum%10  == 3)
				numLetras = numLetras + "tres euros";
			else if (pNum%10  == 4) 
				numLetras = numLetras + "cuatro euros";
			else if (pNum%10  == 5)
				numLetras = numLetras + "cinco euros";
			else if (pNum%10  == 6)
				numLetras = numLetras + "seis euros";
			else if (pNum%10  == 7)
				numLetras = numLetras + "siete euros";
			else if (pNum%10  == 8)
				numLetras = numLetras + "ocho euros";
			else if (pNum%10  == 9)
				numLetras = numLetras + "nueve euros";
		}
		else if (pNum == 0)
			numLetras = "Cero";
		else if(pNum%10 == 1)
			numLetras = numLetras + "un euro";
		else if (pNum%10  == 2)
			numLetras = numLetras + "dos euros";
		else if (pNum%10  == 3)
			numLetras = numLetras + "tres euros";
		else if (pNum%10  == 4)
			numLetras = numLetras + "cuatro euros";
		else if (pNum%10  == 5)
			numLetras = numLetras + "cinco euros";
		else if (pNum%10  == 6)
			numLetras = numLetras + "seis";
		else if (pNum%10  == 7)
			numLetras = numLetras + "siete euros";
		else if (pNum%10  == 8)
			numLetras = numLetras + "ocho euros";
		else if (pNum%10  == 9)
			numLetras = numLetras + "nueve euros";
		else if (pNum == 11)
			numLetras = "Once euros";
		else if (pNum == 12)
			numLetras = "Doce euros";
		else if (pNum == 13)
			numLetras = "Trece euros";
		else if (pNum == 14)
			numLetras = "Catorce euros";
		else if (pNum == 15)
			numLetras = "Quince euros";
		else if (pNum == 10)
			numLetras = "Diez euros";
		else if(pNum == 20)
			numLetras = "Veinte euros";
		else if (pNum == 30)
			numLetras = "Treinta euros";
		else if (pNum == 40)
			numLetras = "Cuarenta euros";
		else if (pNum == 50)
			numLetras = "Cincuenta euros";
		else if (pNum == 60)
			numLetras = "Sesenta euros";
		else if (pNum == 70)
			numLetras = "Setenta euros";
		else if (pNum == 80)
			numLetras = "Ochenta euros";
		else if (pNum == 90)
			numLetras = "Noventa euros";

		return numLetras;
	}

	public void imprimirNumero()
	{
		Mundo modelo = new Mundo();


		Scanner lector = new Scanner(System.in);

		boolean c = true;

		while(c == true) {

			System.out.println("Digite un número (0-99)");

			int pNum = lector.nextInt();

			if (pNum == 1) {
				c = false;



			}
			System.out.println(cadena);


			cadena.add(modelo.deNumeroALetra(pNum));


		}
		EscribirData(cadena);


	}

	public void EscribirData(ArrayList<String> guardar )
	{
		File f = new File("C:\\Monto\\MontoEscrito.txt");
		try 
		{
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			for (int i = 0; i < guardar.size(); i++) 
			{
				pw.println(guardar.get(i));

			}
			fw.close();	

		} 
		catch (Exception e) 
		{
			System.out.println("Error al escribir datos");

		}

	}
	public void LeerData()
	{
		File f = new File("C:\\Monto\\MontoEscrito.txt");
		try 
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea != null)
			{
				linea = br.readLine();
				System.out.println(linea);
			}
			fr.close();
		}
		catch (Exception e) 
		{
			System.out.println("Error, no sé puede leer el archivo");
		}

	}

	public ArrayList<String> getCadena() {
		return cadena;
	}

	public void setCadena(ArrayList<String> cadena) {
		this.cadena = cadena;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

}