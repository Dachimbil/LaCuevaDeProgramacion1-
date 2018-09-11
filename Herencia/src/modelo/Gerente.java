package modelo;

public class Gerente extends Empleado
{
	protected int PersonasAcargo;
	protected String trabajo;
	
	public Gerente(String nombre,int edad)
	{
		super(nombre,edad);
		this.PersonasAcargo =5;
		this.trabajo = "es administrar el trabajo de las personas que tengo a cargo";
		
	}
	
	public void PersonasCargo()
	{
		System.out.println("Hola, me llamo"+ super.nombre + " mi edad es " + super.edad);
		System.out.println("tengo " +  this.PersonasAcargo + " personas a cargo");
	}
	public void trabajo()
	{
		System.out.println("y mi trabajo " + this.trabajo);
		System.out.println("\n");
	}

	public int getPersonasAcargo() {
		return PersonasAcargo;
	}

	public void setPersonasAcargo(int personasAcargo) {
		PersonasAcargo = personasAcargo;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	

}
