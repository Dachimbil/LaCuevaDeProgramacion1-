package modelo;

public class Persona 
{
	protected String nombre;
	protected int edad;

	public Persona (String nombre, int edad)
	{
		this.nombre= nombre;
		this.edad = edad;
	}

	public void correr()
	{
		System.out.println("Yo corro");
	}
	
	public void dormir()
	{
		System.out.println("Yo duermo");
	}
	
	public void compro()
	{
		System.out.println("Yo compro");
	}
	
	public void investigar()
	{
		System.out.println("Yo investigo");
	}
	public void gestiono()
	{
		System.out.println("Yo como");
	}
	public void distribuir()
	{
		System.out.println("Yo bailo");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}





}
