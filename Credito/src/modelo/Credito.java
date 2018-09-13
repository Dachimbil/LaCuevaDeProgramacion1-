package modelo;

public class Credito 
{
	private double Periodo;
	private double Interes;
	private double Inversion;
	private double TasaEfec;
	private double ValorAnualidad;
	private double ValorCuota;

	public Credito(double pP, double pInv, double pIn)
	{
		Periodo = pP;
		Interes =pInv;
		Inversion = pIn;
		calcularTasaEfec();
		calcularAnualidad();
		calcularCuota();
		
	}
	public void calcularTasaEfec()
	{
		TasaEfec = Math.pow(1+Interes, 1/12.0)-1;		
	}
	
	public void calcularAnualidad()
	{
		ValorAnualidad =  Math.pow(1-(1+TasaEfec), -Periodo);
		ValorAnualidad = ValorAnualidad / TasaEfec;
	}
	
	public void calcularCuota()
	{
		ValorCuota = Inversion / ValorAnualidad;
	}

	public double getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(int periodo) {
		Periodo = periodo;
	}

	public double getInteres() {
		return Interes;
	}

	public void setInteres(double interes) {
		Interes = interes;
	}

	public double getInversion() {
		return Inversion;
	}

	public void setInversion(double inversion) {
		Inversion = inversion;
	}

	public double getTasaEfec() {
		return TasaEfec;
	}

	public void setTasaEfec(double tasaEfec) {
		TasaEfec = tasaEfec;
	}

	public double getValorAnualidad() {
		return ValorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		ValorAnualidad = valorAnualidad;
	}

	public double getValorCuota() {
		return ValorCuota;
	}

	public void setValorCuota(double valorCuota) {
		ValorCuota = valorCuota;
	}
	
	
	





}
