package modelo;

public class Mundo 
{
	private Bird Br;
	private Helicopter He;	
	private SeaPlane Spl;
	private Superman Sp;
	
	
	public Mundo()
	{
		Br = new Bird();
		He = new Helicopter();
		Spl =  new SeaPlane();
		Sp =  new Superman();	
	}

	public Bird getBr() {
		return Br;
	}

	public void setBr(Bird br) {
		Br = br;
	}

	public Helicopter getHe() {
		return He;
	}

	public void setHe(Helicopter he) {
		He = he;
	}

	public SeaPlane getSpl() {
		return Spl;
	}

	public void setSpl(SeaPlane spl) {
		Spl = spl;
	}

	public Superman getSp() {
		return Sp;
	}

	public void setSp(Superman sp) {
		Sp = sp;
	}

}
