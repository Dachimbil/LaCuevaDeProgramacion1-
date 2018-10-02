package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField texto;
	private JButton Convertir;
	public static final String CONVERTIR = "CONVERTIR";

	public PanelEntrada() {
		setLayout( new GridLayout(2,2) );

		TitledBorder border = BorderFactory.createTitledBorder("DATOS");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labEntrada = new JLabel("ESCRIBA ALGO");
		
		texto = new JTextField("");
		texto.setForeground(Color.YELLOW);
		texto.setBackground(Color.RED);
		
		Convertir = new JButton("CONVERTIR");
		Convertir.setActionCommand(CONVERTIR);
		
		add(labEntrada);
		add(texto);
		add(new JLabel(""));
		add(Convertir);
	}

	public JLabel getLabEntrada() 
	{
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) 
	{
		this.labEntrada = labEntrada;
	}

	public JTextField getTexto() 
	{
		return texto;
	}

	public void setTexto(JTextField texto) 
	{
		this.texto = texto;
	}

	public JButton getButConvertir() 
	{
		return Convertir;
	}

	public void setButConvertir(JButton Convertir) 
	{
		this.Convertir = Convertir;

	}


	public static String getConvertir() 
	{
		return CONVERTIR;
	}

}