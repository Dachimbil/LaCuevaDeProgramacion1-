package modelo;

public class Superman extends Kryptonian implements Flyer
{
	private int a�os;

	public Superman()
	{
		this.a�os = 1500;
		super.tipo = "heroe";
		super.numOjos = 2;
	}

	@Override
	public String takeOff() 
	{

		return " despegar desde el suelo";
	}

	@Override
	public String land() 
	{
		return " aterriza en cualquier lugar";
	}

	@Override
	public String fly() 
	{

		return " vuela por todo el mundo";
	}

	@Override
	public String ayudarPersonas() 
	{
		return " ayudar a las personas que necesitan de �l";
	}
	
	public String saltarMuros()
	{
		return " saltar muros con su supersalto";
	}
	
	public String pararBalas()
	{
		return " detener balas con solo mirarlas";
	}

	@Override
	public String comer() 
	{
		return " come vegetales";
	}

	public int getA�os() {
		return a�os;
	}

	public void setA�os(int a�os) {
		this.a�os = a�os;
	}

}
