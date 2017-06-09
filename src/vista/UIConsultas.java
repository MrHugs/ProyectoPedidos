package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.comportamiento.ParaUIArticulo;
import control.comportamiento.ParaUICliente;
import control.comportamiento.ParaUIPedidos;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UIConsultas extends JFrame {

	protected JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public UIConsultas() {
		setTitle("Consultas");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ParaUICliente ventanaCliente = new ParaUICliente();
				ventanaCliente.setVisible(true);
			}
		});
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		contentPane.add(btnCliente);
		
		JButton btnArticulo = new JButton("Articulo");
		btnArticulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ParaUIArticulo ventanaArticulo = new ParaUIArticulo();
				ventanaArticulo.setVisible(true);
			}
		});
		contentPane.add(btnArticulo);
		
		JButton btnPedido = new JButton("Pedido");
		btnPedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ParaUIPedidos ventanaPedidos = new ParaUIPedidos();
				ventanaPedidos.setVisible(true);
			}
		});
		contentPane.add(btnPedido);
	}

}
