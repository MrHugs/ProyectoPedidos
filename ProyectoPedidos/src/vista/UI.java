package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JButton btnAltapedido;
	protected JButton btnAltaArticulo;
	protected JButton btnAltaCliente;

	
	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		btnAltapedido = new JButton("Alta Pedido");
		contentPane.add(btnAltapedido);
		
		btnAltaArticulo = new JButton("Alta Articulo");
		contentPane.add(btnAltaArticulo);
		
		btnAltaCliente = new JButton("Alta Cliente");
		contentPane.add(btnAltaCliente);
	}

}
