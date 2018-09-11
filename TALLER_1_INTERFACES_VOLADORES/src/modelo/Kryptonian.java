package modelo;

public abstract class Kryptonian extends Animal
{
	protected String tipo;
	
	public Kryptonian()
	{
		this.tipo = "Heroe";
	}
	
	public abstract String ayudarPersonas();
	

}
