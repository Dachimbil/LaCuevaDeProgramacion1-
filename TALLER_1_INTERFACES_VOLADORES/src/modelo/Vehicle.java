package modelo;

public abstract class Vehicle 
{
	protected int numAsientos;
	
	public Vehicle()
	{
		this.numAsientos = 0;
	}
	public abstract String transportar();
	
	public int getNumAsientos() 
	{
		return numAsientos;
	}
	public void setNumAsientos(int numAsientos) 
	{
		this.numAsientos = numAsientos;
	}

}
