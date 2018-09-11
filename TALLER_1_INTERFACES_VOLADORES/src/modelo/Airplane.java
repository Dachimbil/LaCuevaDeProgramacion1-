package modelo;

public abstract class Airplane extends Vehicle implements Flyer
{
	protected int numLlantas;
	
	public Airplane()
	{
	this.numLlantas = 4;
	super.numAsientos = 4;
	}
	
	public abstract String takeOff();
	public abstract String land();
	public abstract String fly();

	public int getNumLlantas() {
		return numLlantas;
	}

	public void setNumLlantas(int numLlantas) {
		this.numLlantas = numLlantas;
	}

}
