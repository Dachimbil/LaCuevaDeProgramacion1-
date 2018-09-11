package modelo;

public class Helicopter extends Airplane
{
	private int numHelices;
	
	public Helicopter()
	{
		this.numHelices = 4;
		super.numLlantas = 0;
		super.numAsientos = 6;
	}

	@Override
	public String takeOff() 
	{
		
		return " despega desde una base";
	}

	@Override
	public String land() 
	{
		
		return " aterriza en las zonas especiales para helicopteros";
	}

	@Override
	public String fly() 
	{
		return " vuela de forma inclinada";
	}

	@Override
	public String transportar() 
	{
		return " transportar personas";
		
	}

	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}
	

	
		
}


