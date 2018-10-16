package vista;

import javax.swing.JButton;

public class PanelBotones 
{
	private JButton v,m,c;
	public static final String VARIABLES = "Variables";
	public static final String MULTIPLO = "Multiplo";
	public static final String CIFRAS = "Cifras";
	
	public PanelBotones()
	{
		v =  new JButton();
		v.setActionCommand("VARIABLES");
		
		m =  new JButton();
		m.setActionCommand("MULTIPLO");
		
		c =  new JButton();
		c.setActionCommand("CIFRAS");
		
		//add();
		//add(m);
		//add(c);
		
	}
	
	

}
