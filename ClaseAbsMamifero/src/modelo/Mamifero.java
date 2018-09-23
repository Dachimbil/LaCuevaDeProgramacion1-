package modelo;

public abstract class Mamifero 
{
	protected String raza;
	protected int numPatas;
	protected String nombre;
	protected String sonido;
	
	public Mamifero()
	{
		this.raza = "";
		this.numPatas = 0;
	}
	
	public abstract void ConfigurarAnimal();
	public abstract void ImprimirDatosAnimal();
	

}
