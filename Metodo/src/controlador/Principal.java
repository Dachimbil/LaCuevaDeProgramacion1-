package controlador;

import java.util.Scanner;

import modelo.Contenedora;

public class Principal {

	public static void main(String[] args) 
	{
		Contenedora c = new Contenedora();
		Scanner l = new Scanner(System.in);
		boolean continuar = true;
		
		while(continuar == true) {	
		System.out.println("Ingrese un número del 1-10");
		String numero = l.nextLine();
		int num = Integer.parseInt(numero);
		System.out.println(c.numeroExistente(null, num));
		}
		
		l.close();
	
		
	

	}

}
