package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import control.adaptador.Altas;
import modelo.Cliente;
import utiles.Tipo;
import vista.UIAltas;

public class ParaUIAltas extends UIAltas{
	
	
	
	public ParaUIAltas(){
		
		
	
		Altas alta = new Altas();
		
		btnDardealtaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alta.altaCliente(txtDniCliente.getText(), txtNombreCliente.getText(), txtDescripcionCliente.getText(), Tipo.cliente);
				lblInfpCliente.setText("Cliente Dado de alta");
				
			}
		});
		
		btnDarDeAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alta.altaArticulo(txtIdArticulo.getText(), txtNombreArticulo.getText(), Float.parseFloat(txtPrecioChachi.getText()),txtDescripcionArticulo.getText(), Tipo.articulo);
			lblInformacionArticulo.setText("Articulo dado de alta");
			}
		});
		
		btnDarDeAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alta.altaPedido(txtIdPedido.getText(),(Cliente) comboCliente.getSelectedItem(), new ArrayList<>(), Tipo.pedido);
				lblInfoPedido.setText("Pedido dado de alta");
			}
			//Falta añadirlineasAlPedido
		});
		
		
		
		
		
		
		
		
		
	}
	}
