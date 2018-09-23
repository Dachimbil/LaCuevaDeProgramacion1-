package modelo;

import java.util.ArrayList;

public class Sueldo 
{

	private ArrayList<Integer> salario;

	public Sueldo()
	{
		salario = new ArrayList<>();
	}

	public boolean agregarSalario(int pSalario)
	{
		boolean agregarSalario = false;

		if(salario.size()<20) 
		{
			salario.add(pSalario);
			agregarSalario = true;
		}

		return agregarSalario;
	}

	public int darMayorSalario()
	{
		int mayorSalario = 0;
		for (int i = 0; i < salario.size(); i++) 
		{
			if(salario.get(i)> mayorSalario)
			{
				mayorSalario = salario.get(i);
			}
		}
		return mayorSalario;
	}
	
	public int darMenorSalario()
	{
		int menorSalario = salario.get(0);
		for (int i = 0; i < salario.size(); i++)
		{
			if(salario.get(i)< menorSalario)
			{
				menorSalario = salario.get(i);
			}
		}
		return menorSalario;
	}
	
	public int darPromedioSalarios()
	{
		int promSalarios = 0;
		for (int i = 0; i < salario.size(); i++) 
		{
		
			promSalarios = promSalarios +salario.get(i);
		
		}	
		return promSalarios/salario.size();
		
	}

}