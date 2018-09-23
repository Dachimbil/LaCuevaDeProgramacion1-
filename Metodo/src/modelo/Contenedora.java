package modelo;

public class Contenedora 
{
	private int contenedora[];
	
	public Contenedora()
	{
		contenedora = new int [10];
		for (int i = 0; i < contenedora.length; i++) 
		{
			contenedora[i]= (int) Math.floor(Math.random() *10);
		}
	}
	
	public String numeroExistente( int[]arreglo, int pContenedora)
	{
		boolean exis = false;
		String existe = "";
		 for (int i = 0; i < contenedora.length; i++) 
		{
			 if(contenedora[i] == pContenedora)
			 {
				 existe = "El número existe";
				 exis = true;
			 }
		}
		 if(exis ==false)
		 {
			 existe = "EL numero no existe";
		 }		
		return existe;
	}
	
}