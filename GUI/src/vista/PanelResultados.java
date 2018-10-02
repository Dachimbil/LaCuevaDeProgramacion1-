package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextField Resultado;

	public PanelResultados() {

		setLayout( new GridLayout(2,1) );
		TitledBorder border = BorderFactory.createTitledBorder("RESULTADO");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("LA CONVERSIÓN ES:");
		Resultado = new JTextField("");
		Resultado.setForeground(Color.WHITE);
		Resultado.setBackground(Color.BLUE);

		add(labResultado);
		add(Resultado);

	}

	public JLabel getLabResultado() {
		return labResultado;
	}

	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}

	public JTextField getResultado() {
		return Resultado;
	}

	public void setResultado(JTextField Resultado) {
		this.Resultado = Resultado;
	}
}