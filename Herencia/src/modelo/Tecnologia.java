package modelo;

public class Tecnologia extends Empleado
{
	private String revisar;
	private int Computadores;
	
	public Tecnologia(String nombre, int edad)
	{
		super(nombre, edad);
		this.revisar = " reviso que los aparatos electronicos estén en buenas condiciones";
		this.Computadores = 100;
	}
	
	public void ver()
	{
		System.out.println("Hola, mi nombre es " + super.nombre + " y mi edad es " + super.edad);
		System.out.println("Yo" + this.revisar);
	}

	public void computadores()
	{
		System.out.println("Tengo " + this.Computadores + " computadores en el inventario");
		System.out.println("\n");
	}

	public String getRevisar() {
		return revisar;
	}

	public void setRevisar(String revisar) {
		this.revisar = revisar;
	}

	public int getComputadores() {
		return Computadores;
	}

	public void setComputadores(int computadores) {
		Computadores = computadores;
	}
}
