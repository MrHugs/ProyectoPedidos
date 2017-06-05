package control.adaptador;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Articulo;
import modelo.Pedido;
import utiles.Tipo;

public class Consulta implements IConsultas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean consultaPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente consultaCliente(String id, Tipo tipo) {
		Cliente cliente = new Cliente(id, "Manolito", "Gafotas");
		GestorUnificado gestorU = new GestorUnificado(tipo);
		ArrayList listaCliente = (ArrayList) gestorU.obtener();
		if (listaCliente.contains(cliente)) {
			int posicion = listaCliente.indexOf(cliente);
			return (Cliente) listaCliente.get(posicion);
		} else {
			return null;
		}
	}

	@Override
	public Articulo consultaArticulo(String id, Tipo tipo) {
		Articulo articulo = new Articulo(id,"Manolito",54f, "Gafotas");
		GestorUnificado gestorU = new GestorUnificado(tipo);
		ArrayList listaArticulo = (ArrayList) gestorU.obtener();
		if (listaArticulo.contains(articulo)) {
			int posicion = listaArticulo.indexOf(articulo);
			return (Articulo) listaArticulo.get(posicion);
		}
		return null;
	}
}
