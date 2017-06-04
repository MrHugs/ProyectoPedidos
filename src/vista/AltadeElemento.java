package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;

import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTable;

public class AltadeElemento extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtId;
	private JTextField txtIdentificador;
	private JTextField txtNombreArticulo;
	private JTextField txtPrecio;
	private JTable tablaCesta;
	protected JComboBox comboCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltadeElemento frame = new AltadeElemento();
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
	public AltadeElemento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane panelDePestañas = new JTabbedPane(JTabbedPane.TOP);
		panelDePestañas.setBounds(10, 11, 548, 427);
		contentPane.add(panelDePestañas);
		
		JPanel panelCliente = new JPanel();
		panelDePestañas.addTab("AltaCliente", null, panelCliente, null);
		panelCliente.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 41, 46, 14);
		panelCliente.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(69, 38, 86, 20);
		panelCliente.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 99, 46, 14);
		panelCliente.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(69, 96, 171, 20);
		panelCliente.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(10, 155, 69, 14);
		panelCliente.add(lblDescripcion);
		
		JTextArea txtAreaDescripcion = new JTextArea();
		txtAreaDescripcion.setBounds(89, 150, 196, 93);
		panelCliente.add(txtAreaDescripcion);
		
		JButton btnDardealtaCliente = new JButton("Dar de Alta");
		btnDardealtaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDardealtaCliente.setBounds(272, 347, 113, 23);
		panelCliente.add(btnDardealtaCliente);
		
		JButton btnCancelarCliente = new JButton("Cancelar");
		btnCancelarCliente.setBounds(416, 347, 89, 23);
		panelCliente.add(btnCancelarCliente);
		
		
		JPanel panelArticulo = new JPanel();
		panelDePestañas.addTab("AltaArticulo", null, panelArticulo, null);
		panelArticulo.setLayout(null);
		
		JLabel lblIdentificador = new JLabel("Identificador");
		lblIdentificador.setBounds(10, 28, 93, 14);
		panelArticulo.add(lblIdentificador);
		
		JLabel lblNombreArticulo = new JLabel("Nombre");
		lblNombreArticulo.setBounds(10, 71, 46, 14);
		panelArticulo.add(lblNombreArticulo);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 112, 46, 14);
		panelArticulo.add(lblPrecio);
		
		JLabel lblDescripcionArticulo = new JLabel("Descripcion");
		lblDescripcionArticulo.setBounds(10, 156, 81, 14);
		panelArticulo.add(lblDescripcionArticulo);
		
		txtIdentificador = new JTextField();
		txtIdentificador.setBounds(115, 25, 86, 20);
		panelArticulo.add(txtIdentificador);
		txtIdentificador.setColumns(10);
		
		txtNombreArticulo = new JTextField();
		txtNombreArticulo.setBounds(115, 68, 129, 20);
		panelArticulo.add(txtNombreArticulo);
		txtNombreArticulo.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(115, 109, 46, 20);
		panelArticulo.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblEuro = new JLabel("\u20AC");
		lblEuro.setBounds(167, 112, 46, 14);
		panelArticulo.add(lblEuro);
		
		JTextArea txtDescripcionArticulo = new JTextArea();
		txtDescripcionArticulo.setBounds(115, 151, 219, 85);
		panelArticulo.add(txtDescripcionArticulo);
		
		JButton btnDardealtaArticulo = new JButton("Dar de Alta");
		btnDardealtaArticulo.setBounds(296, 343, 110, 23);
		panelArticulo.add(btnDardealtaArticulo);
		
		JButton btnCancelarArticulo = new JButton("Cancelar");
		btnCancelarArticulo.setBounds(432, 343, 89, 23);
		panelArticulo.add(btnCancelarArticulo);
		
		JPanel panelPedido = new JPanel();
		panelDePestañas.addTab("AltaPedido", null, panelPedido, null);
		panelPedido.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 27, 46, 14);
		panelPedido.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(77, 24, 86, 20);
		panelPedido.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 74, 46, 14);
		panelPedido.add(lblCliente);
		
		comboCliente = new JComboBox();
		comboCliente.setBounds(77, 73, 109, 17);
		Cliente cliente = new Cliente("2", "Ivantwo", "le desesperamos");
		comboCliente.addItem(cliente);
		panelPedido.add(comboCliente);
		
		JLabel lblCesta = new JLabel("Cesta");
		lblCesta.setBounds(10, 136, 46, 14);
		panelPedido.add(lblCesta);
		
		String[] nombrecolumnas = {"Articulo", "Cantidad"};
		Object[][] datos ={{"Articulo", "Cantidad"},{"Articulo", "Cantidad"}};
		
			tablaCesta = new JTable(datos,nombrecolumnas);
			tablaCesta.setBounds(10, 161, 223, 164);
			panelPedido.add(tablaCesta);
			
			JButton btnAnadirArticulo = new JButton("A\u00F1adir elemento al pedido");
			btnAnadirArticulo.setBounds(254, 132, 157, 23);
			panelPedido.add(btnAnadirArticulo);
			
			JButton btnDardealtaPedido = new JButton("Dar de alta");
			btnDardealtaPedido.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnDardealtaPedido.setBounds(271, 350, 138, 20);
			panelPedido.add(btnDardealtaPedido);
			
			JButton btnCancelarPedido = new JButton("Cancelar");
			btnCancelarPedido.setBounds(419, 349, 89, 23);
			panelPedido.add(btnCancelarPedido);
	}
}


