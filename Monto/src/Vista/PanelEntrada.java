package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel Entrada;
	private JTextField Texto;
	private JButton Monto;
	public static final String CONVERTIR = "MONTO_ESCRITO";	
	
	public PanelEntrada() 
	{
		setLayout(new GridLayout(2,1));
		
		TitledBorder borde =  BorderFactory.createTitledBorder("ZONA DE CONVERSIÓN");
		borde.setTitleColor(Color.BLACK);
		setBorder(borde);
		
		Entrada = new JLabel("Ingrese el monto que desee convertir");
		
		Texto =  new JTextField("");
		Texto.setForeground(Color.BLACK);
		Texto.setBackground(Color.ORANGE);
		
		Monto =  new JButton("CONVERTIR A MONTO ESCRITO");
		Monto.setActionCommand(CONVERTIR);
		
		add(Entrada);
		add(Texto);
		add(new JLabel(""));
		add(Monto);
		
		
	}

	public JLabel getEntrada()
	{
		return Entrada;
	}

	public void setEntrada(JLabel entrada) 
	{
		Entrada = entrada;
	}

	public JTextField getTexto() 
	{
		return Texto;
	}

	public void setTexto(JTextField texto) 
	{
		Texto = texto;
	}

	public JButton getMonto()
	{
		return Monto;
	}

	public void setMonto(JButton monto) 
	{
		Monto = monto;
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	public static String getConvertir()
	{
		return CONVERTIR;
	}
	

}
