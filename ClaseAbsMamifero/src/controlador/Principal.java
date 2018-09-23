package controlador;

import modelo.Mundo;

public class Principal 
{
	private static Mundo mundo;
	
	public static void main(String[] args) 
	{ 
		mundo =  new Mundo();
		mundo.getCanino1().ImprimirDatosAnimal();
		mundo.getFelino1().ImprimirDatosAnimal();
	}
}
		
		
