package modelo;

public class SeaPlane extends Airplane
{
	private int numAlas;

	public SeaPlane()
	{
		this.numAlas = 2;
		super.numLlantas = 0;
		super.numAsientos = 4;
	}

	@Override
	public String takeOff() 
	{
		return "es capaz de despegar desde una superficie de agua";
	}

	@Override
	public String land() 
	{
		return "aterriza en un aeródromos";
	}

	@Override
	public String fly() 
	{
		return "vuela a baja altura";
	}

	@Override
	public String transportar() 
	{
		return "transportar provisiones";

	}

	public int getNumAlas() {
		return numAlas;
	}

	public void setNumAlas(int numAlas) {
		this.numAlas = numAlas;
	}



}
