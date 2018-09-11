package modelo;

public class Rectangulo implements Figura 
{
	private int alto;
	private int ancho;
	private int area;
	private int perimetro;

	@Override
	public void calcularArea() 
	{
	
		this.area = this.alto*this.ancho;
		
	}

	@Override
	public void calcularPerimetro() 
	{
		
		this.perimetro= 2*this.alto + 2*this.ancho;
		
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}
	

}
