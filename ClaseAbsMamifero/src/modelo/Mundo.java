package modelo;

public class Mundo 
{
	private Canino canino1;
	private Felino felino1;
	
	public Mundo()
	{
		canino1 = new Canino();
		felino1= new Felino();
	}

	public Canino getCanino1() {
		return canino1;
	}

	public void setCanino1(Canino canino1) {
		this.canino1 = canino1;
	}

	public Felino getFelino1() {
		return felino1;
	}

	public void setFelino1(Felino felino1) {
		this.felino1 = felino1;
	}
	

}
