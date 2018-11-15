package modelo;

public class Ajedrez 
{
	private int[][] TableroAjedrez;
	private int filas = 8;
	private int columnas = 8;
	private int alfil = 3;
	private int rey = 10;
	private int posicionAlfilFilas;
	private int posicionAlfilColumnas;

	public Ajedrez()
	{
		TableroAjedrez = new int[filas][columnas];
	}

	public void crearMatriz()
	{
		for (int i = 0; i < filas; i++) 
		{
			for (int j = 0; j < columnas; j++) 
			{
				TableroAjedrez[i][j] = -1;
			}
		}
	}

	public void ubicacionAlfil(int i, int j)
	{
		TableroAjedrez[i-1][j-1] = alfil;
		posicionAlfilFilas = i-1;
		posicionAlfilColumnas = j-1;
	}

	public void ubicacionRey(int i, int j)
	{
		TableroAjedrez[i-1][j-1] = rey;
	}

	public void mostrarMatriz()
	{
		for (int i = 0; i < filas; i++) 
		{
			for (int j = 0; j < columnas; j++) 
			{
				System.out.print(TableroAjedrez[i][j] + "   ");
			}
			System.out.println("  ");
		}
	}

	public boolean Jaque()
	{
		boolean jaque = false;
		if(jaque == false)
		{
			for (int i = 0; 8 > posicionAlfilFilas + i && 8 > posicionAlfilColumnas + i; i++) 
			{
				if(TableroAjedrez[posicionAlfilFilas + i][posicionAlfilColumnas + i] == 10)
				{
					jaque = true;
				}
			}
		}
		if(jaque == false)
		{
			for (int i = 0; 0 <= posicionAlfilFilas - i && 8 > posicionAlfilColumnas + i; i++) 
			{
				if(TableroAjedrez[posicionAlfilFilas - i][posicionAlfilColumnas + i] == 10)
				{
					jaque = true;
				}
			}
		}
		if(jaque == false)
		{
			for (int i = 0; 0 <= posicionAlfilFilas - i && 0<= posicionAlfilColumnas - i; i++) 
			{
				if(TableroAjedrez[posicionAlfilFilas - i][posicionAlfilColumnas - i] == 10)
				{
					jaque = true;
				}
			}
		}
		if(jaque == false)
		{
			for (int i = 0; 8 > posicionAlfilFilas + i && 0 <= posicionAlfilColumnas - i; i++) 
			{
				if(TableroAjedrez[posicionAlfilFilas + i][posicionAlfilColumnas - i] == 10)
				{
					jaque = true;
				}
			}
		}
		return jaque;
	}

	public void mostrarJaque()
	{
		if(Jaque() == true)
		{
			System.out.println("El alfil está en jaque");
		}
		else 
		{
			System.out.println("El alfil no está en jaque");
		}
	}
}

