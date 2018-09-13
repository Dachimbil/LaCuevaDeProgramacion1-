package modelo;

public abstract class Usuario 
{
	protected String NIT;
	protected String nombre;
	protected String apellido;
	protected String correroElectronico;
	
	public Usuario(String NIT, String nombre, String apellido, String correoElectronico)
	{
		this.NIT = NIT;
		this.nombre =  nombre;
		this.apellido = apellido;
		this.correroElectronico = correoElectronico;
		
	}
	
	public abstract String agregarUsuario();
	public abstract String guardarArchivo();
	public abstract String leerArchivo();

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreroElectronico() {
		return correroElectronico;
	}

	public void setCorreroElectronico(String correroElectronico) {
		this.correroElectronico = correroElectronico;
	}
	

}
