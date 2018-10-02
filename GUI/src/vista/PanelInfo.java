package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelInfo extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel informacion;
	
	public PanelInfo() 
	{
		setLayout( new GridLayout(3,1) );
		TitledBorder border = BorderFactory.createTitledBorder("INFORMACIÓN");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		informacion = new JLabel("Este programa es para poder convetir un dato escrito y poder procesarlo.");
		add(informacion);
		
	}
	

}
