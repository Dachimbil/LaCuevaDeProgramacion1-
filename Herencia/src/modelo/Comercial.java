package modelo;

public class Comercial extends Gerente
{
	private String distribuir;
	private int camiones;
	
	public Comercial(String nombre, int edad)
	{
		super(nombre, edad);
		this.distribuir = " distrubuyo el producto final a las ciudades";
		this.camiones = 50;
	}
	
	public void distri()
	{
		System.out.println("Hola, mi nombre es " + super.nombre + " y mi edad es " + super.edad);
		System.out.println("Yo" + this.distribuir);
			
	}
	
	public void camion()
	{
	 System.out.println("Tengo " + this.camiones + " camiones para llevar el producto");
	}

	public String getDistribuir() {
		return distribuir;
	}

	public void setDistribuir(String distribuir) {
		this.distribuir = distribuir;
	}

	public int getCamiones() {
		return camiones;
	}

	public void setCamiones(int camiones) {
		this.camiones = camiones;
	}
	
	

}
