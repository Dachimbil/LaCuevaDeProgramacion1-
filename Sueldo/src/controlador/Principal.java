package controlador;

import java.util.Scanner;
import modelo.Sueldo;

public class Principal {

	public static void main(String[] args) 
	{
		Sueldo salarios = new Sueldo();
		Scanner lec = new Scanner(System.in);
		boolean continuar = true;
		
		while(continuar == true) {
		
		System.out.println("Ingresa el salario de un empleado");
		String res = lec.nextLine();
		
		try {
			int sueldo = Integer.parseInt(res);
			if (sueldo == -1)
			{
				System.out.println("El mayor salario es " + salarios.darMayorSalario());
				System.out.println("El menor salario es " + salarios.darMenorSalario());
				System.out.println("El promedio de los salarios ingresados es " + salarios.darPromedioSalarios());
			
				lec.close();
			}
		
			else if(salarios.agregarSalario(sueldo)==true)
			{
				System.out.println("El salario ingresado se agregó");
			}
			else if(salarios.agregarSalario(sueldo) != true)
			{
				System.out.println("Se agregaron 20 salarios");
				System.out.println("El mayor salario es " + salarios.darMayorSalario());
				System.out.println("El menor salario es " + salarios.darMenorSalario());
				System.out.println("El promedio salarial es" + salarios.darPromedioSalarios());
				lec.close();
			}
		}
		
		catch (Exception e) 
		{
			System.out.println("Número no válido");
		}
	}

}
}

