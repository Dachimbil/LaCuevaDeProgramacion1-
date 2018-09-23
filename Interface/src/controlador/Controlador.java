package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo mundo;
	private Interfaz interfaz;

	public Controlador()
	{
		mundo = new Mundo();
		interfaz = new Interfaz();

		mundo.getCirculo().setRadio(Double.parseDouble(interfaz.pedirRadioCirculo()));
		mundo.getCirculo().calcularArea();
		mundo.getCirculo().calcularPerimetro();
		interfaz.ResultadosCirculo("Circulo", mundo.getCirculo().getArea(),mundo.getCirculo().getPerimetro() );

		mundo.getCuadrado().setLado(Integer.parseInt(interfaz.pedirLadoCuadrado()));
		mundo.getCuadrado().calcularArea();
		mundo.getCuadrado().calcularPerimetro();
		interfaz.ResultadosCuadrado("Cuadrado", mundo.getCuadrado().getArea(), mundo.getCuadrado().getPerimetro());
		
		mundo.getRectangulo().setAncho(Integer.parseInt(interfaz.pedirAnchoRectangulo()));
		mundo.getRectangulo().setAlto(Integer.parseInt(interfaz.pedirAltoRectangulo()));
		mundo.getRectangulo().calcularArea();
		mundo.getRectangulo().calcularPerimetro();
		interfaz.ResultadosRectangulo("Rectangulo", mundo.getRectangulo().getArea(), mundo.getRectangulo().getPerimetro());
		
		
		
		
	}
	
	
	
	



}
