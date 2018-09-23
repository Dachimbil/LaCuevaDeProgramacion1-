package modelo;

public class Canino extends Mamifero
{
	private String peso;
	private int edad;
		
	public Canino()
	{
		this.ConfigurarAnimal();
	}
	
	public void ImprimirDatosAnimal()
	{
		System.out.println("\n\nDatos del canino");
		System.out.println("                      ");
		System.out.println("Hola, mi nombre es "+super.nombre);
		System.out.println("soy un "+super.raza);
		System.out.println("tengo "+super.numPatas+" patas");
		System.out.println("tengo un peso de "+this.peso);
		System.out.println("mi edad es de " +this.edad+ " años");
		System.out.println("y hago "+super.sonido);
	}

	@Override
	public void ConfigurarAnimal() 
	{
		super.nombre = "Toby";
		super.raza="Cocker Spanish";
		super.numPatas = 4;
		this.peso = "5 kilogramos";
		this.edad = 7;
		super.sonido = "guau guau";
		
	}
	

	
}
