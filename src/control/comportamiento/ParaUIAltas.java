package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import control.adaptador.Altas;
import modelo.Cliente;
import utiles.Tipo;
import vista.UIAltas;

public class ParaUIAltas extends UIAltas{
	
	Altas alta = new Altas();
	public ParaUIAltas(){
	
		
		
		
		btnDarDeAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = (Cliente) comboCliente.getSelectedItem();
				alta.altaPedido(txtId, cliente, listaLineaPedidos, Tipo.pedido);
				System.out.println("soy un syso");
				System.out.println("soy un syso");

			}
			
		});
		
		
		
		
	}
	}
