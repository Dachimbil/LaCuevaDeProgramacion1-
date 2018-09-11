package modelo;

import javax.swing.JOptionPane;

public class Bird extends Animal implements Flyer
{
	private int numPlumas;
	
	public Bird()
	{
		this.numPlumas = 50;
	}
	

	@Override
	public String comer() 
	{
		return " come pan";
	}
	
	public String hacerNido()
	{
		return " nidos en los arboles";
	}
	public String dejarHuevos()
	{
		return " nacen por huevos";
	}

	@Override
	public String takeOff() 
	{
		return " despega con facilidad";
	}

	@Override
	public String land() 
	{
		return " aterriza en cualquier superficie";
	}

	@Override
	public String fly() 
	{
		return " vuela por la ciudad";
	}


	public int getNumPlumas() {
		return numPlumas;
	}


	public void setNumPlumas(int numPlumas) {
		this.numPlumas = numPlumas;
	}
	

}
