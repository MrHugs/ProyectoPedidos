package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UICliente extends JFrame {

	protected JPanel contentPane;
	protected JButton btnBuscar;
	protected JTextField txtBuscaCliente;
	protected JLabel lblId;
	protected JTextField txtClienteEncontrado;

	

	/**
	 * Create the frame.
	 */
	public UICliente() {
		setTitle("Cliente");
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
		
		
		String[] nombrecolumnas = {"DNI","Nombre", "Descripción"};
		Object[][] datos ={{"456365X", "SrNick","5"},{"456365X", "SrNick","7"}};
		
		lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		contentPane.add(lblId, gbc_lblId);
		
		txtBuscaCliente = new JTextField();
		GridBagConstraints gbc_txtBuscaCliente = new GridBagConstraints();
		gbc_txtBuscaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtBuscaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscaCliente.gridx = 1;
		gbc_txtBuscaCliente.gridy = 0;
		contentPane.add(txtBuscaCliente, gbc_txtBuscaCliente);
		txtBuscaCliente.setColumns(10);
		
		txtClienteEncontrado = new JTextField();
		GridBagConstraints gbc_txtClienteEncontrado = new GridBagConstraints();
		gbc_txtClienteEncontrado.anchor = GridBagConstraints.NORTH;
		gbc_txtClienteEncontrado.insets = new Insets(0, 0, 5, 0);
		gbc_txtClienteEncontrado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClienteEncontrado.gridx = 1;
		gbc_txtClienteEncontrado.gridy = 1;
		contentPane.add(txtClienteEncontrado, gbc_txtClienteEncontrado);
		txtClienteEncontrado.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.gridx = 1;
		gbc_btnBuscar.gridy = 3;
		contentPane.add(btnBuscar, gbc_btnBuscar);
	}

}
