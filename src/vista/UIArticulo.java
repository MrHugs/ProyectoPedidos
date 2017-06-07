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

public class UIArticulo extends JFrame {

	protected JPanel contentPane;
	protected JTable tablaArticulo;
	protected JScrollPane scrollPane;


	/**
	 * Create the frame.
	 */
	public UIArticulo() {
		setTitle("Articulo");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		String[] nombrecolumnas = {"Identificador","Nombre", "Precio", "Descripcion"};
		Object[][] datos ={{"343443", "Movil","700","Phone"},{"343443", "Movil","700","Phone"}};
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tablaArticulo = new JTable(datos,nombrecolumnas);
		scrollPane.setViewportView(tablaArticulo);
	}

}
