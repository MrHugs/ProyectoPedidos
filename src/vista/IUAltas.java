package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class IUAltas extends JFrame {
	protected JPanel contentPane;
	protected JTextField txtNombre;
	protected JTable tablaCesta;
	protected JTextField txtIdentificador;
	protected JTextField txtNombreArticulo;
	protected JTextField txtPrecio;
	protected JTextField txtDni;
	protected JTextField txtId;
	protected JComboBox comboCliente;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUAltas frame = new IUAltas();
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
	public IUAltas() {
		setTitle("Altas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane panelDePestañas = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(panelDePestañas);
		
		
		JPanel panelArticulo = new JPanel();
		panelDePestañas.addTab("AltaArticulo", null, panelArticulo, null);
		GridBagLayout gbl_panelArticulo = new GridBagLayout();
		gbl_panelArticulo.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelArticulo.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelArticulo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelArticulo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelArticulo.setLayout(gbl_panelArticulo);
		
		JLabel lblIdentificador = new JLabel("Identificador");
		GridBagConstraints gbc_lblIdentificador = new GridBagConstraints();
		gbc_lblIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificador.gridx = 2;
		gbc_lblIdentificador.gridy = 1;
		panelArticulo.add(lblIdentificador, gbc_lblIdentificador);
		
		txtIdentificador = new JTextField();
		GridBagConstraints gbc_txtIdentificador = new GridBagConstraints();
		gbc_txtIdentificador.gridwidth = 2;
		gbc_txtIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdentificador.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdentificador.gridx = 5;
		gbc_txtIdentificador.gridy = 1;
		panelArticulo.add(txtIdentificador, gbc_txtIdentificador);
		txtIdentificador.setColumns(10);
		
		JLabel lblNombreArticulo = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 2;
		gbc_lblNombreArticulo.gridy = 3;
		panelArticulo.add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		txtNombreArticulo = new JTextField();
		GridBagConstraints gbc_txtNombreArticulo = new GridBagConstraints();
		gbc_txtNombreArticulo.gridwidth = 2;
		gbc_txtNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreArticulo.gridx = 5;
		gbc_txtNombreArticulo.gridy = 3;
		panelArticulo.add(txtNombreArticulo, gbc_txtNombreArticulo);
		txtNombreArticulo.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 5;
		panelArticulo.add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 5;
		gbc_txtPrecio.gridy = 5;
		panelArticulo.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblEuros = new JLabel("\u20AC");
		GridBagConstraints gbc_lblEuros = new GridBagConstraints();
		gbc_lblEuros.insets = new Insets(0, 0, 5, 5);
		gbc_lblEuros.anchor = GridBagConstraints.WEST;
		gbc_lblEuros.gridx = 6;
		gbc_lblEuros.gridy = 5;
		panelArticulo.add(lblEuros, gbc_lblEuros);
		
		JLabel lblDescripcionArticulo = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcionArticulo = new GridBagConstraints();
		gbc_lblDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionArticulo.gridx = 2;
		gbc_lblDescripcionArticulo.gridy = 7;
		panelArticulo.add(lblDescripcionArticulo, gbc_lblDescripcionArticulo);
		
		JTextArea txtDescripcionArticulo = new JTextArea();
		GridBagConstraints gbc_txtDescripcionArticulo = new GridBagConstraints();
		gbc_txtDescripcionArticulo.gridheight = 2;
		gbc_txtDescripcionArticulo.gridwidth = 2;
		gbc_txtDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcionArticulo.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcionArticulo.gridx = 5;
		gbc_txtDescripcionArticulo.gridy = 7;
		panelArticulo.add(txtDescripcionArticulo, gbc_txtDescripcionArticulo);
		
		JButton btnDarDeAltaArticulo = new JButton("Dar de alta");
		GridBagConstraints gbc_btnDarDeAltaArticulo = new GridBagConstraints();
		gbc_btnDarDeAltaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAltaArticulo.gridx = 6;
		gbc_btnDarDeAltaArticulo.gridy = 13;
		panelArticulo.add(btnDarDeAltaArticulo, gbc_btnDarDeAltaArticulo);
		
		JButton btnCancelarArticulo = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelarArticulo = new GridBagConstraints();
		gbc_btnCancelarArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancelarArticulo.gridx = 7;
		gbc_btnCancelarArticulo.gridy = 13;
		panelArticulo.add(btnCancelarArticulo, gbc_btnCancelarArticulo);
		
		JPanel panelPedido = new JPanel();
		panelDePestañas.addTab("AltaPedido", null, panelPedido, null);
		GridBagLayout gbl_panelPedido = new GridBagLayout();
		gbl_panelPedido.columnWidths = new int[]{46, 0, 0, 156, 157, 89, 0};
		gbl_panelPedido.rowHeights = new int[]{20, 17, 42, 23, 0, 0, 164, 0, 23, 0, 0, 0, 0};
		gbl_panelPedido.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelPedido.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelPedido.setLayout(gbl_panelPedido);
		
		String[] nombrecolumnas = {"Articulo", "Cantidad"};
		Object[][] datos ={{"Articulo", "Cantidad"},{"Articulo", "Cantidad"}};
			
			JLabel lblId = new JLabel("Id");
			GridBagConstraints gbc_lblId = new GridBagConstraints();
			gbc_lblId.anchor = GridBagConstraints.EAST;
			gbc_lblId.insets = new Insets(0, 0, 5, 5);
			gbc_lblId.gridx = 1;
			gbc_lblId.gridy = 2;
			panelPedido.add(lblId, gbc_lblId);
			
			txtId = new JTextField();
			GridBagConstraints gbc_txtId = new GridBagConstraints();
			gbc_txtId.insets = new Insets(0, 0, 5, 5);
			gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtId.gridx = 3;
			gbc_txtId.gridy = 2;
			panelPedido.add(txtId, gbc_txtId);
			txtId.setColumns(10);
			
			JLabel lblCliente = new JLabel("Cliente");
			GridBagConstraints gbc_lblCliente = new GridBagConstraints();
			gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
			gbc_lblCliente.gridx = 1;
			gbc_lblCliente.gridy = 3;
			panelPedido.add(lblCliente, gbc_lblCliente);
			
			comboCliente = new JComboBox();
			comboCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("mew");
				}
			});
			
			GridBagConstraints gbc_comboCliente = new GridBagConstraints();
			gbc_comboCliente.insets = new Insets(0, 0, 5, 5);
			gbc_comboCliente.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboCliente.gridx = 3;
			gbc_comboCliente.gridy = 3;
			panelPedido.add(comboCliente, gbc_comboCliente);
			
			JLabel lblCesta = new JLabel("Cesta");
			GridBagConstraints gbc_lblCesta = new GridBagConstraints();
			gbc_lblCesta.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblCesta.insets = new Insets(0, 0, 5, 5);
			gbc_lblCesta.gridx = 1;
			gbc_lblCesta.gridy = 5;
			panelPedido.add(lblCesta, gbc_lblCesta);
			
			JButton btnAnadirPedido = new JButton("A\u00F1adir elemento al pedido");
			btnAnadirPedido.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					UIAñadirelemento nuevaVentana = new UIAñadirelemento();
					nuevaVentana.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnAnadirPedido = new GridBagConstraints();
			gbc_btnAnadirPedido.insets = new Insets(0, 0, 5, 5);
			gbc_btnAnadirPedido.gridx = 4;
			gbc_btnAnadirPedido.gridy = 5;
			panelPedido.add(btnAnadirPedido, gbc_btnAnadirPedido);
		
			tablaCesta = new JTable(datos,nombrecolumnas);
			GridBagConstraints gbc_tablaCesta = new GridBagConstraints();
			gbc_tablaCesta.fill = GridBagConstraints.BOTH;
			gbc_tablaCesta.insets = new Insets(0, 0, 5, 5);
			gbc_tablaCesta.gridwidth = 4;
			gbc_tablaCesta.gridx = 1;
			gbc_tablaCesta.gridy = 6;
			panelPedido.add(tablaCesta, gbc_tablaCesta);
		
		JButton btnDarDeAltaPedido = new JButton("Dar de alta");
		GridBagConstraints gbc_btnDarDeAltaPedido = new GridBagConstraints();
		gbc_btnDarDeAltaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAltaPedido.gridx = 4;
		gbc_btnDarDeAltaPedido.gridy = 9;
		panelPedido.add(btnDarDeAltaPedido, gbc_btnDarDeAltaPedido);
		
		JButton btnCancelarPedido = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelarPedido = new GridBagConstraints();
		gbc_btnCancelarPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancelarPedido.gridx = 5;
		gbc_btnCancelarPedido.gridy = 9;
		panelPedido.add(btnCancelarPedido, gbc_btnCancelarPedido);
			
			JPanel panelCliente = new JPanel();
			panelDePestañas.addTab("AltaCliente", null, panelCliente, null);
			GridBagLayout gbl_panelCliente = new GridBagLayout();
			gbl_panelCliente.columnWidths = new int[]{46, 10, 151, 32, 113, 31, 89, 0};
			gbl_panelCliente.rowHeights = new int[]{38, 20, 38, 20, 34, 93, 104, 23, 0, 0};
			gbl_panelCliente.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelCliente.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelCliente.setLayout(gbl_panelCliente);
			
			JLabel lblDni = new JLabel("DNI");
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 2;
			gbc_lblDni.gridy = 1;
			panelCliente.add(lblDni, gbc_lblDni);
			
			txtDni = new JTextField();
			GridBagConstraints gbc_txtDni = new GridBagConstraints();
			gbc_txtDni.gridwidth = 2;
			gbc_txtDni.insets = new Insets(0, 0, 5, 5);
			gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDni.gridx = 3;
			gbc_txtDni.gridy = 1;
			panelCliente.add(txtDni, gbc_txtDni);
			txtDni.setColumns(10);
			
			JLabel lblNombre = new JLabel("Nombre");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 2;
			gbc_lblNombre.gridy = 3;
			panelCliente.add(lblNombre, gbc_lblNombre);
			
			txtNombre = new JTextField();
			GridBagConstraints gbc_txtNombre = new GridBagConstraints();
			gbc_txtNombre.anchor = GridBagConstraints.NORTH;
			gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
			gbc_txtNombre.gridwidth = 2;
			gbc_txtNombre.gridx = 3;
			gbc_txtNombre.gridy = 3;
			panelCliente.add(txtNombre, gbc_txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblDescripcion = new JLabel("Descripcion");
			GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
			gbc_lblDescripcion.anchor = GridBagConstraints.NORTH;
			gbc_lblDescripcion.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescripcion.gridwidth = 2;
			gbc_lblDescripcion.gridx = 2;
			gbc_lblDescripcion.gridy = 5;
			panelCliente.add(lblDescripcion, gbc_lblDescripcion);
			
			JTextArea txtAreaDescripcion = new JTextArea();
			GridBagConstraints gbc_txtAreaDescripcion = new GridBagConstraints();
			gbc_txtAreaDescripcion.fill = GridBagConstraints.BOTH;
			gbc_txtAreaDescripcion.insets = new Insets(0, 0, 5, 0);
			gbc_txtAreaDescripcion.gridwidth = 3;
			gbc_txtAreaDescripcion.gridx = 4;
			gbc_txtAreaDescripcion.gridy = 5;
			panelCliente.add(txtAreaDescripcion, gbc_txtAreaDescripcion);
			
			JButton btnDardealtaCliente = new JButton("Dar de Alta");
			btnDardealtaCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GridBagConstraints gbc_btnDardealtaCliente = new GridBagConstraints();
			gbc_btnDardealtaCliente.anchor = GridBagConstraints.NORTH;
			gbc_btnDardealtaCliente.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDardealtaCliente.insets = new Insets(0, 0, 5, 5);
			gbc_btnDardealtaCliente.gridx = 5;
			gbc_btnDardealtaCliente.gridy = 7;
			panelCliente.add(btnDardealtaCliente, gbc_btnDardealtaCliente);
			
			JButton btnCancelarCliente = new JButton("Cancelar");
			GridBagConstraints gbc_btnCancelarCliente = new GridBagConstraints();
			gbc_btnCancelarCliente.insets = new Insets(0, 0, 5, 0);
			gbc_btnCancelarCliente.anchor = GridBagConstraints.NORTH;
			gbc_btnCancelarCliente.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnCancelarCliente.gridx = 6;
			gbc_btnCancelarCliente.gridy = 7;
			panelCliente.add(btnCancelarCliente, gbc_btnCancelarCliente);
	}
}


