package modelo;

public class Mundo
{
	private Ejercicio_1 Ej1;
	private Ejercicio_2 Ej2;
	private Ejercicio_3 Ej3;
	
	public Mundo()
	{
		Ej1 =  new Ejercicio_1();
		Ej2 =  new Ejercicio_2(0, 0);
		Ej3 =  new Ejercicio_3();
		
		
		
	}

	public Ejercicio_1 getEj1() {
		return Ej1;
	}

	public void setEj1(Ejercicio_1 ej1) {
		Ej1 = ej1;
	}

	public Ejercicio_2 getEj2() {
		return Ej2;
	}

	public void setEj2(Ejercicio_2 ej2) {
		Ej2 = ej2;
	}

	public Ejercicio_3 getEj3() {
		return Ej3;
	}

	public void setEj3(Ejercicio_3 ej3) {
		Ej3 = ej3;
	}

}
