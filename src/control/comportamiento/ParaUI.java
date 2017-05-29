package control.comportamiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Iterator;

import control.logica.Gestor;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;



public class ParaUI extends vista.UI {
	public ParaUI() {
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Cliente("1","3"));
			}
		});
		btnAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Articulo());
			}
		});
		btnAltapedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Pedido());
			}
		});
	}

}
