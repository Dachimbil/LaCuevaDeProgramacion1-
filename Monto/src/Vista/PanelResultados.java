package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
	private static final long serialVersionUID =  1L;
	private JLabel EntradaResultado;
	private JTextField Resultado;

	public PanelResultados()
	{
		setLayout(new GridLayout());

		TitledBorder borde =  BorderFactory.createTitledBorder("RESULTADO");
		borde.setTitleColor(Color.BLACK);
		setBorder(borde);

		EntradaResultado = new JLabel("LA CONVERSIÓN ES:");

		Resultado = new JTextField("");
		Resultado.setForeground(Color.BLACK);
		Resultado.setBackground(Color.ORANGE);

		add(EntradaResultado);
		add(Resultado);


	}

	public JLabel getEntradaResultado()
	{
		return EntradaResultado;
	}

	public void setEntradaResultado(JLabel entradaResultado) 
	{
		EntradaResultado = entradaResultado;
	}

	public JTextField getResultado() 
	{
		return Resultado;
	}

	public void setResultado(String resultado) 
	{
	 this.Resultado.setText(resultado);
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

}
