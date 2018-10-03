package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import modelo.Mundo;

public class InterfazGUI extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultados;
	private PanelInfo panelInformacion;
	private Mundo m;

	public InterfazGUI()
	{
		m =  new Mundo();
		
		setSize(800, 400);
		setResizable(false);
		setTitle("MONTO ESCRITO");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());
		
		panelEntrada =  new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		
		panelResultados =  new PanelResultados();
		add(panelResultados,  BorderLayout.CENTER);
		
		panelInformacion =  new PanelInfo();
		add(panelInformacion, BorderLayout.SOUTH);
		
		panelEntrada.getMonto().addActionListener(this);


	}



	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals(panelEntrada.CONVERTIR))
		{
			panelResultados.setResultado(m.deNumeroALetra(Integer.parseInt(panelEntrada.getTexto().getText())));
		}
		
		


	}

}
