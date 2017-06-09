package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.logica.Consulta;
import modelo.Articulo;
import modelo.Cliente;
import utiles.Tipo;
import vista.UIArticulo;

public class ParaUIArticulo extends UIArticulo {

	public ParaUIArticulo() {
		Consulta consulta = new Consulta();
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Articulo articulo = consulta.consultaArticulo(txtBuscaArticulo.getText(), Tipo.articulo);
				txtArticuloEncontrado.setText("ID: " + articulo.getIdentificador() + " Nombre: " + articulo.getNombre()
						+ " Precio: " + articulo.getPrecio() + " Descripcion: " + articulo.getDescripcion());
			}
		});
	}

}
