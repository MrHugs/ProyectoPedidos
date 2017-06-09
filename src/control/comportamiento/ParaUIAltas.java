package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				
			}
		});
		
		
		
		
		
		
	}
	}
