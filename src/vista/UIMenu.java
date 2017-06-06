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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIMenu frame = new UIMenu();
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
	public UIMenu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnAltas = new JButton("Altas");
		btnAltas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				UIAltas ventanaAltas = new UIAltas();
				ventanaAltas.setVisible(true);
			}
		});
		btnAltas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(btnAltas);
		
		JButton btnConsultas = new JButton("Consultas");
		btnConsultas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UIConsultas ventanaConsultas = new UIConsultas();
				ventanaConsultas.setVisible(true);
			}
		});
		btnConsultas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(btnConsultas);
	}

}
