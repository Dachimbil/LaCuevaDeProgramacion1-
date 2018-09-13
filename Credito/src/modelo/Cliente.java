package modelo;

public class Cliente extends Usuario
{

	public Cliente(String NIT, String nombre, String apellido, String correoElectronico)
	{
		super(NIT, nombre, apellido, correoElectronico);
	}

	@Override
	public String agregarUsuario() 
	{
		return null;
	}

	@Override
	public String guardarArchivo() 
	{
		return null;
	}

	@Override
	public String leerArchivo() 
	{
		return null;
	}

}
