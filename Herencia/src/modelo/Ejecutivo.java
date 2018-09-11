package modelo;

public class Ejecutivo extends Gerente
{
	private String gestionar;
	private int empresas;
	
	public Ejecutivo(String nombre, int edad)
	{
		super(nombre,edad);
		this.gestionar = " gestiono y administro empresas ";
		this.empresas = 3;
	}
	
	public void gestion()
	{
		System.out.println("Hola, mi nombre es" + super.nombre + " y mi edad es " + super.edad);
		System.out.println("Yo" + this.gestionar);
	}
	
	public void empresas()
	{
		System.out.println("y tengo " + this.empresas + " empresas a cargo");
		System.out.println("\n");
	}

	public String getGestionar() {
		return gestionar;
	}

	public void setGestionar(String gestionar) {
		this.gestionar = gestionar;
	}

	public int getEmpresas() {
		return empresas;
	}

	public void setEmpresas(int empresas) {
		this.empresas = empresas;
	}

}
