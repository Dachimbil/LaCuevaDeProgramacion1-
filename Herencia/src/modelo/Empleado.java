package modelo;

public class Empleado extends Persona
{
	protected double salario;
	protected String cargo;
	
	public Empleado(String nombre, int edad)
	{
		super(nombre,edad);
		this.salario = 1500000;
		this.cargo="Ingeniero de sistemas";
	}

	public void cobrar()
	{
		System.out.println("Yo me llamo " + super.nombre);
		System.out.println("Mi edad es " + super.edad);
		System.out.println("mi cargo es " + this.cargo);
	}
 
	public void salario()
	{
		System.out.println("y mi salario es " + this.salario);
		System.out.println("\n");
	}
	
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
