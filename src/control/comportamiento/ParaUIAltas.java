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
	
		
		
		
		btnDarDeAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alta.altaArticulo(txtIdentificador.getText(), txtNombreArticulo.getText(), Float.parseFloat(txtPrecioChachi.getText()), txtDescripcionArticulo.getText(), Tipo.articulo);
			}
		});
		
		
		
		
	}
	}
