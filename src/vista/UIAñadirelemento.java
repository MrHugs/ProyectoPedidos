package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.adaptador.GestorUnificado;
import utiles.Tipo;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UIAñadirelemento extends JFrame {

	protected JPanel contentPane;
	protected JComboBox comboArticulo;
	protected JLabel lblNLinea;
	protected JTextField textField;
	protected JButton btnAñadirElemento;
	GestorUnificado gestorA = new GestorUnificado(Tipo.articulo);
	

	

	/**
	 * Create the frame.
	 */
	public UIAñadirelemento() {
		
		
		
		setTitle("A\u00F1adir elemento");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{199, 36, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{14, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNumeroLinea = new JLabel("Numero Linea");
		GridBagConstraints gbc_lblNumeroLinea = new GridBagConstraints();
		gbc_lblNumeroLinea.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroLinea.gridx = 0;
		gbc_lblNumeroLinea.gridy = 1;
		contentPane.add(lblNumeroLinea, gbc_lblNumeroLinea);
		
		lblNLinea = new JLabel();
		GridBagConstraints gbc_lblNLinea = new GridBagConstraints();
		gbc_lblNLinea.gridwidth = 2;
		gbc_lblNLinea.insets = new Insets(0, 0, 5, 5);
		gbc_lblNLinea.gridx = 1;
		gbc_lblNLinea.gridy = 1;
		contentPane.add(lblNLinea, gbc_lblNLinea);
		
		JLabel lblArticulo = new JLabel("Articulo");
		GridBagConstraints gbc_lblArticulo = new GridBagConstraints();
		gbc_lblArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblArticulo.anchor = GridBagConstraints.NORTH;
		gbc_lblArticulo.gridx = 0;
		gbc_lblArticulo.gridy = 3;
		contentPane.add(lblArticulo, gbc_lblArticulo);
		
		comboArticulo = new JComboBox<>(((ArrayList)gestorA.obtener()).toArray());
		GridBagConstraints gbc_comboArticulo = new GridBagConstraints();
		gbc_comboArticulo.gridwidth = 2;
		gbc_comboArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_comboArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboArticulo.gridx = 1;
		gbc_comboArticulo.gridy = 3;
		contentPane.add(comboArticulo, gbc_comboArticulo);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidad.gridx = 0;
		gbc_lblCantidad.gridy = 5;
		contentPane.add(lblCantidad, gbc_lblCantidad);
		
		btnAñadirElemento = new JButton("Añadir");
		
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 5;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		GridBagConstraints gbc_btnAñadirElemento = new GridBagConstraints();
		gbc_btnAñadirElemento.gridx = 4;
		gbc_btnAñadirElemento.gridy = 7;
		contentPane.add(btnAñadirElemento, gbc_btnAñadirElemento);
	}

}

