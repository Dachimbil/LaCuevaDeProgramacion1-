package modelo;

public class Mundo 
{
	private Ejercicio_1 E1;
	private Ejercicio_2 E2;
	private Ejercicio_3 E3;
	
	public Mundo()
	{
		E1 = new Ejercicio_1();
		E2 =  new Ejercicio_2();
		E3 = new Ejercicio_3();		
	}

	public Ejercicio_1 getE1() {
		return E1;
	}

	public void setE1(Ejercicio_1 e1) {
		E1 = e1;
	}

	public Ejercicio_2 getE2() {
		return E2;
	}

	public void setE2(Ejercicio_2 e2) {
		E2 = e2;
	}

	public Ejercicio_3 getE3() {
		return E3;
	}

	public void setE3(Ejercicio_3 e3) {
		E3 = e3;
	}

}
