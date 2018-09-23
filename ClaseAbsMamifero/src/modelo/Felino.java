package modelo;

public class Felino extends Mamifero
{
	private String colorOjos;
	private int capacidadSalto;
	
	public Felino()
	{
		this.ConfigurarAnimal();
	}
	
	public void ImprimirDatosAnimal()
	{
		System.out.println("\n\nDatos del felino");
		System.out.println("                      ");
		System.out.println("Hola, mi nombre es "+super.nombre);
		System.out.println("soy un "+super.raza);
		System.out.println("tengo "+super.numPatas+" patas");
		System.out.println("tengo ojos de color "+this.colorOjos);
		System.out.println("mi capacidad de salto es de " +this.capacidadSalto+ " metros de altura");
		System.out.println("y hago "+super.sonido);
	}

	@Override
	public void ConfigurarAnimal() 
	{
		super.nombre = "Garfield";
		super.raza="Gato angora";
		super.numPatas = 4;
		this.colorOjos = "azul";
		this.capacidadSalto = 5;
		super.sonido="miau miau";
		
	}

}
