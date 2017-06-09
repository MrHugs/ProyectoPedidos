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
import javax.swing.table.DefaultTableModel;

import control.adaptador.GestorUnificado;
import modelo.Cliente;
import utiles.Tipo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;

public class UIAltas extends JFrame {
	protected JPanel contentPane;
	protected JTextField txtNombreCliente;
	protected JTable tablaCesta;
	protected JTextField txtIdArticulo;
	protected JTextField txtNombreArticulo;
	protected JTextField txtDniCliente;
	protected JComboBox comboCliente;
	protected JTextField txtIdPedido;
	protected JTextArea txtDescripcionArticulo;
	protected JTextArea txtDescripcionCliente;
	protected JButton btnDarDeAltaPedido;
	protected JButton btnDarDeAltaArticulo;
	protected JTextArea txtPrecioChachi;
	protected JButton btnDardealtaCliente;

	/**
	 * Create the frame.
	 */
	public UIAltas() {
		setTitle("Altas");
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
		gbl_panelArticulo.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelArticulo.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelArticulo.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelArticulo.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		panelArticulo.setLayout(gbl_panelArticulo);

		JLabel lblIdentificador = new JLabel("Identificador");
		GridBagConstraints gbc_lblIdentificador = new GridBagConstraints();
		gbc_lblIdentificador.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificador.gridx = 2;
		gbc_lblIdentificador.gridy = 1;
		panelArticulo.add(lblIdentificador, gbc_lblIdentificador);

		txtIdArticulo = new JTextField();
		GridBagConstraints gbc_txtIdArticulo = new GridBagConstraints();
		gbc_txtIdArticulo.gridwidth = 2;
		gbc_txtIdArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdArticulo.gridx = 5;
		gbc_txtIdArticulo.gridy = 1;
		panelArticulo.add(txtIdArticulo, gbc_txtIdArticulo);
		txtIdArticulo.setColumns(10);

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
		
		JTextField txtPrecioArticulo = new JTextField();
		GridBagConstraints gbc_txtPrecioArticulo = new GridBagConstraints();
		gbc_txtPrecioArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioArticulo.gridx = 5;
		gbc_txtPrecioArticulo.gridy = 5;
		panelArticulo.add(txtPrecioArticulo, gbc_txtPrecioArticulo);
		txtPrecioArticulo.setColumns(10);

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

		txtDescripcionArticulo = new JTextArea();
		GridBagConstraints gbc_txtDescripcionArticulo = new GridBagConstraints();
		gbc_txtDescripcionArticulo.gridheight = 2;
		gbc_txtDescripcionArticulo.gridwidth = 2;
		gbc_txtDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcionArticulo.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcionArticulo.gridx = 5;
		gbc_txtDescripcionArticulo.gridy = 7;
		panelArticulo.add(txtDescripcionArticulo, gbc_txtDescripcionArticulo);

		btnDarDeAltaArticulo = new JButton("Dar de alta");
		
		
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
		gbl_panelPedido.columnWidths = new int[] { 0, 156, 157, 89, 0 };
		gbl_panelPedido.rowHeights = new int[] { 42, 23, 0, 164, 0, 0, 0, 0, 0, 0 };
		gbl_panelPedido.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelPedido.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelPedido.setLayout(gbl_panelPedido);

		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		panelPedido.add(lblId, gbc_lblId);

		txtIdPedido = new JTextField();
		GridBagConstraints gbc_txtIdPedido = new GridBagConstraints();
		gbc_txtIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdPedido.gridx = 1;
		gbc_txtIdPedido.gridy = 0;
		panelPedido.add(txtIdPedido, gbc_txtIdPedido);
		txtIdPedido.setColumns(10);

		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 0;
		gbc_lblCliente.gridy = 1;
		panelPedido.add(lblCliente, gbc_lblCliente);

		
		//rellenar el combobox
		GestorUnificado gestorC = new GestorUnificado(Tipo.cliente);
		comboCliente = new JComboBox<>(((ArrayList)gestorC.obtener()).toArray());
		
		
		

		GridBagConstraints gbc_comboCliente = new GridBagConstraints();
		gbc_comboCliente.insets = new Insets(0, 0, 5, 5);
		gbc_comboCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboCliente.gridx = 1;
		gbc_comboCliente.gridy = 1;

		panelPedido.add(comboCliente, gbc_comboCliente);

		JLabel lblCesta = new JLabel("Cesta");
		GridBagConstraints gbc_lblCesta = new GridBagConstraints();
		gbc_lblCesta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCesta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCesta.gridx = 0;
		gbc_lblCesta.gridy = 2;
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
		gbc_btnAnadirPedido.gridx = 2;
		gbc_btnAnadirPedido.gridy = 2;
		panelPedido.add(btnAnadirPedido, gbc_btnAnadirPedido);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		panelPedido.add(scrollPane, gbc_scrollPane);

		
		

		tablaCesta = new JTable();
		  
		  tablaCesta.setModel(new DefaultTableModel(
		   new Object[][] {{null, null},},
		   new String[] {"Articulo", "Cantidad"}) {
		   boolean[] columnEditables = new boolean[] {
		    false, true, true, false
		   };
		   public boolean isCellEditable(int row, int column) {
		    return columnEditables[column];
		   }
		  });
		tablaCesta.setBorder(new EmptyBorder(3, 3, 3, 3));
		tablaCesta.setBackground(new Color(255, 255, 204));
		tablaCesta.setForeground(new Color(0, 51, 102));
		tablaCesta.setFont(new Font("Arial", Font.PLAIN, 12));
		scrollPane.setViewportView(tablaCesta);

		btnDarDeAltaPedido = new JButton("Dar de alta");
		
		btnDarDeAltaPedido.setFont(new Font("Verdana", Font.PLAIN, 11));
		GridBagConstraints gbc_btnDarDeAltaPedido = new GridBagConstraints();
		gbc_btnDarDeAltaPedido.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarDeAltaPedido.gridx = 2;
		gbc_btnDarDeAltaPedido.gridy = 8;
		panelPedido.add(btnDarDeAltaPedido, gbc_btnDarDeAltaPedido);

		JButton btnCancelarPedido = new JButton("Cancelar");
		btnCancelarPedido.setFont(new Font("Verdana", Font.PLAIN, 11));
		GridBagConstraints gbc_btnCancelarPedido = new GridBagConstraints();
		gbc_btnCancelarPedido.gridx = 3;
		gbc_btnCancelarPedido.gridy = 8;
		panelPedido.add(btnCancelarPedido, gbc_btnCancelarPedido);

		JPanel panelCliente = new JPanel();
		panelDePestañas.addTab("AltaCliente", null, panelCliente, null);
		GridBagLayout gbl_panelCliente = new GridBagLayout();
		gbl_panelCliente.columnWidths = new int[] { 46, 10, 151, 32, 113, 31, 89, 0 };
		gbl_panelCliente.rowHeights = new int[] { 38, 20, 38, 20, 34, 93, 104, 23, 0, 0 };
		gbl_panelCliente.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelCliente.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelCliente.setLayout(gbl_panelCliente);

		JLabel lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 2;
		gbc_lblDni.gridy = 1;
		panelCliente.add(lblDni, gbc_lblDni);

		txtDniCliente = new JTextField();
		GridBagConstraints gbc_txtDniCliente = new GridBagConstraints();
		gbc_txtDniCliente.gridwidth = 2;
		gbc_txtDniCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtDniCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDniCliente.gridx = 3;
		gbc_txtDniCliente.gridy = 1;
		panelCliente.add(txtDniCliente, gbc_txtDniCliente);
		txtDniCliente.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		panelCliente.add(lblNombre, gbc_lblNombre);

		txtNombreCliente = new JTextField();
		GridBagConstraints gbc_txtNombreCliente = new GridBagConstraints();
		gbc_txtNombreCliente.anchor = GridBagConstraints.NORTH;
		gbc_txtNombreCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreCliente.gridwidth = 2;
		gbc_txtNombreCliente.gridx = 3;
		gbc_txtNombreCliente.gridy = 3;
		panelCliente.add(txtNombreCliente, gbc_txtNombreCliente);
		txtNombreCliente.setColumns(10);

		JLabel lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.NORTH;
		gbc_lblDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridwidth = 2;
		gbc_lblDescripcion.gridx = 2;
		gbc_lblDescripcion.gridy = 5;
		panelCliente.add(lblDescripcion, gbc_lblDescripcion);

		txtDescripcionCliente = new JTextArea();
		GridBagConstraints gbc_txtDescripcionCliente = new GridBagConstraints();
		gbc_txtDescripcionCliente.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcionCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescripcionCliente.gridwidth = 3;
		gbc_txtDescripcionCliente.gridx = 4;
		gbc_txtDescripcionCliente.gridy = 5;
		panelCliente.add(txtDescripcionCliente, gbc_txtDescripcionCliente);

		btnDardealtaCliente = new JButton("Dar de Alta");
		
		
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
