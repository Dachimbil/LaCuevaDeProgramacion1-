package modelo;

public class Cuadrado implements Figura
{
	private int perimetro;
	private int area;
	private int lado;
	
	public void calcularArea() 
	{
	  this.area = this.lado * this.lado;
		
	}
	
	public void calcularPerimetro() 
	{
		this.perimetro = this.lado*4;
		
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	

}
