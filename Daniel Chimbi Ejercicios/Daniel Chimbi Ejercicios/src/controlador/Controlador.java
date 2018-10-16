package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador implements ActionListener
{
	private Mundo m;
	private InterfazGui gui;

	public Controlador()
	{
		m = new Mundo();
		gui =  new InterfazGui(this);
		
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals(gui.getResultados().INTERCAMBIAR))
		{
			gui.getResultados().getResulIntercambiar().setText(m.getE1().intercambiarNumeros());		
		}
		else if(e.getActionCommand().equals(gui.getResultados().MULTIPLO))
		{
			gui.getResultados().getResulMultiplo().setText(m.getE2().Multiplo());
			
		}
		else if(e.getActionCommand().equals(gui.getResultados().CIFRAS))
		{
			gui.getResultados().getResulCifras().setText(m.getE3().cifras());
			
		}
		
		
	}

}
