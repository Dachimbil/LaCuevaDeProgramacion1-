package modelo;

public class Circulo implements Figura
{
	private double radio;
	private double area;
	private double perimetro;
	
	public void calcularPerimetro() 
	{
		
		this.perimetro = 2 * Math.PI * this.radio;
	}
	
	public void calcularArea()
	{
		this.area = Math.PI * Math.pow(this.radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

}
