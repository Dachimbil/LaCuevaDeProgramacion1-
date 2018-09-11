package modelo;

public class Mantenimiento extends Empleado
{
	private String reparar;
	private int herramientas;
	
	public Mantenimiento(String nombre, int edad)
	{
		super(nombre, edad);
		this.reparar = " reparo los daños fisicos de la empresa ";
		this.herramientas = 10;
		
	}
	
	public void reparar()
	{
		System.out.println("Hola, mi nombre es " + super.nombre + " mi edad es " + super.edad);
		System.out.println("Yo" + this.reparar);
	}
	
	public void herramientas()
	{
		System.out.println("y tengo " + this.herramientas + " herramientas para reparar");
		System.out.println("\n");
	}

	public String getReparar() {
		return reparar;
	}

	public void setReparar(String reparar) {
		this.reparar = reparar;
	}

	public int getHerramientas() {
		return herramientas;
	}

	public void setHerramientas(int herramientas) {
		this.herramientas = herramientas;
	}

}
