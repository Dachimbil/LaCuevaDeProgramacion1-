package modelo;

public class Mundo 
{
	private Persona p;
	private Alumno a;
	private Profesor pr;
	
	public Mundo()
	{
		p = new Persona();
		a =  new Alumno();
		pr =  new Profesor();
		
	}

	public Persona getP() {
		return p;
	}

	public void setP(Persona p) {
		this.p = p;
	}

	public Alumno getA() {
		return a;
	}

	public void setA(Alumno a) {
		this.a = a;
	}

	public Profesor getPr() {
		return pr;
	}

	public void setPr(Profesor pr) {
		this.pr = pr;
	}
	
	

}
