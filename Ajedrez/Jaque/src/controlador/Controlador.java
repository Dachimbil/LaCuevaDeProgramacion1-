package controlador;

import java.util.Scanner;

import modelo.Ajedrez;

public class Controlador 
{

	public Controlador()
	{
		Scanner scanner = new Scanner(System.in);
		Ajedrez ajedrez = new Ajedrez();
		
		System.out.println("Ingrese la fila del alfil");
		String fa = scanner.nextLine();
		int filaAlfil = Integer.parseInt(fa);
		System.out.println("Ingrese la columna del alfil");
		String ca = scanner.nextLine();
		int columnaAlfil = Integer.parseInt(ca);
		System.out.println("Ingrese la fila del rey");
		String fr = scanner.nextLine();
		int filaRey = Integer.parseInt(fr);
		System.out.println("Ingrese la columna del rey");
		String cr = scanner.nextLine();
		int columnaRey = Integer.parseInt(cr);
		
		ajedrez.crearMatriz();
		ajedrez.ubicacionAlfil(filaAlfil, columnaAlfil);
		ajedrez.ubicacionRey(filaRey, columnaRey);
		ajedrez.mostrarMatriz();
		ajedrez.Jaque();
		ajedrez.mostrarJaque();
		
	}

}
