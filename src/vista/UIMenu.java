package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UIMenu extends JFrame {

	protected JPanel contentPane;
	protected JButton btnAltas;
	protected JButton btnConsultas;

	/**
	 * Create the frame.
	 */
	public UIMenu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		btnAltas = new JButton("Altas");
		btnAltas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(btnAltas);
		btnConsultas = new JButton("Consultas");
		btnConsultas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(btnConsultas);
	}

}
