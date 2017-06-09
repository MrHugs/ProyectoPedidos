package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UIPedidos extends JFrame {
	

	protected JPanel contentPane;
	protected JButton btnBuscar;
	protected JTextField txtBuscaPedido;
	protected JLabel lblId;
	protected JTextArea textAreaInfoPedido;

	

	/**
	 * Create the frame.
	 */
	public UIPedidos() {
		setTitle("Articulo");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		contentPane.add(lblId, gbc_lblId);
		
		txtBuscaPedido = new JTextField();
		GridBagConstraints gbc_txtBuscaCliente = new GridBagConstraints();
		gbc_txtBuscaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtBuscaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscaCliente.gridx = 1;
		gbc_txtBuscaCliente.gridy = 0;
		contentPane.add(txtBuscaPedido, gbc_txtBuscaCliente);
		txtBuscaPedido.setColumns(10);
		
		textAreaInfoPedido = new JTextArea();
		GridBagConstraints gbc_textAreaInfoPedido = new GridBagConstraints();
		gbc_textAreaInfoPedido.insets = new Insets(0, 0, 5, 0);
		gbc_textAreaInfoPedido.fill = GridBagConstraints.BOTH;
		gbc_textAreaInfoPedido.gridx = 1;
		gbc_textAreaInfoPedido.gridy = 1;
		contentPane.add(textAreaInfoPedido, gbc_textAreaInfoPedido);
		
		btnBuscar = new JButton("Buscar");
		
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.gridx = 1;
		gbc_btnBuscar.gridy = 3;
		contentPane.add(btnBuscar, gbc_btnBuscar);
	}

}
