package modelo;

public class Ejercicio_1 
{
	private int x,y;
	
	public Ejercicio_1()
	{
		this.x = 5;
		this.y = 8;		
	}
	
	public void X() 
	{
		this.x = this.x + 3 ;
	}
	public void Y()
	{
		this.y = this.y - 3;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
