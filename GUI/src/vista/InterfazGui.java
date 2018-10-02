package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class InterfazGui extends JFrame implements ActionListener{


	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; 
	private PanelResultados panelResultados; 
	private PanelInfo informacion;

	public InterfazGui() 
	{


		setSize(800,400); 
		setResizable(false); 
		setTitle("INTERFAZ GRÁFICA"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout( new BorderLayout() );

		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);

		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
		
		informacion = new PanelInfo();
		add(informacion, BorderLayout.SOUTH);
		
		panelEntrada.getButConvertir().addActionListener(this);
	}


	public void actionPerformed(ActionEvent evento) 
	{
		
		if (evento.getActionCommand().equals(panelEntrada.CONVERTIR)) 
		{
			panelResultados.getResultado().setText(panelEntrada.getTexto().getText()+": PROCESADO");
		}
	}
}