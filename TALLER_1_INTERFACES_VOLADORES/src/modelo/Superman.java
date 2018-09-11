package modelo;

public class Superman extends Kryptonian implements Flyer
{
	private int años;

	public Superman()
	{
		this.años = 1500;
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
		return " ayudar a las personas que necesitan de él";
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

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

}
