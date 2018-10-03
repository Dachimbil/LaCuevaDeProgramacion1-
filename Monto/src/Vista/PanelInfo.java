package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelInfo extends JPanel
{
	private static final long serialVersionUID =  1L;
	private JLabel Informacion;

	public PanelInfo()
	{
		setLayout(new GridLayout(3,1));

		TitledBorder borde =  BorderFactory.createTitledBorder("INFORMACIÓN");
		borde.setTitleColor(Color.BLACK);
		setBorder(borde);

		Informacion =  new JLabel("Este programa sirve para poder convertir un número a letra.");
		add(Informacion);

	}

	public JLabel getInformacion() 
	{
		return Informacion;
	}

	public void setInformacion(JLabel informacion) 
	{
		Informacion = informacion;
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

}
