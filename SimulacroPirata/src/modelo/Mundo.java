package modelo;

public class Mundo {

	private Persistencia BD;
	private Pirata Sparrow;

	public Mundo() 
	{
		BD = new Persistencia();
		Sparrow = new Pirata();
	}

	public Persistencia getBD()
	{
		return BD;
	}

	public void setBD(Persistencia bD) 
	{
		BD = bD;
	}

	public Pirata getSparrow() 
	{
		return Sparrow;
	}

	public void setSparrow(Pirata sparrow)
	{
		Sparrow = sparrow;
	}
}