package modelo;

public class Mundo 
{
	private Circulo circulo;
	private Cuadrado cuadrado;
	private Rectangulo rectangulo;
	
	
	public Mundo()
	{
		circulo =  new Circulo();
		cuadrado = new Cuadrado();
		rectangulo = new Rectangulo();
		
	}

	public Circulo getCirculo() 
	{
		return circulo;
	}

	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}

	public Cuadrado getCuadrado() {
		return cuadrado;
	}

	public void setCuadrado(Cuadrado cuadrado) {
		this.cuadrado = cuadrado;
	}

	public Rectangulo getRectangulo() {
		return rectangulo;
	}

	public void setRectangulo(Rectangulo rectangulo) {
		this.rectangulo = rectangulo;
	}

	

}
