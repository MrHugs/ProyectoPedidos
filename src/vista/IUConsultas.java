package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class IUConsultas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUConsultas frame = new IUConsultas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IUConsultas() {
		setTitle("Consultas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				IUAñadirelemento nuevaVentana = new IUAñadirelemento();
				nuevaVentana.setVisible(true);
			}
		});
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		contentPane.add(btnCliente);
		
		JButton btnArticulo = new JButton("Articulo");
		contentPane.add(btnArticulo);
		
		JButton btnPedido = new JButton("Pedido");
		contentPane.add(btnPedido);
	}

}
