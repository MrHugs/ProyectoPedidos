package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import control.logica.Gestor;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;

public class ParaUI extends vista.UI {

	ArrayList lista = new ArrayList<>();

	public ParaUI() {
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Cliente("1", "3"));
			}
		});
		btnAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Articulo("1", "mew", 20f, "zapatilla"));
			}
		});
		btnAltapedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Pedido("1", new Cliente("1", "Manolo"), lista)); // Aqui
																							// en
																							// vez
																							// de
																							// este
																							// pedido
																							// y
																							// cliente,
																							// se
																							// tiene
																							// que
																							// pillar
																							// de
																							// los
																							// campos
																							// de
																							// la
																							// vista
																							// los
																							// datos
																							// para
																							// cada
																							// constructor
			}
		});
	}

}
