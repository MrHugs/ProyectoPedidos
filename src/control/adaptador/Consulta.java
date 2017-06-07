package control.adaptador;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Articulo;
import modelo.Pedido;
import utiles.Tipo;
import utiles.Varios;


public class Consulta implements IConsultas {

	public static void main(String[] args) {
		Altas alta = new Altas();
		Consulta consulta = new Consulta();
		Cliente cliente = new Cliente("1", "paco", "mi padre");
		Cliente cliente2 = new Cliente("2", "lola", "mi padre");

		ArrayList arraysu = new ArrayList<>();
		arraysu.add(4);
		alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDescripcion(), Tipo.cliente);
		alta.altaPedido("6", cliente2, arraysu, Tipo.pedido);
		consulta.consultaPedido("3", cliente, Tipo.pedido);
		
	}

	@Override
	public Pedido consultaPedido(String idPedido, Cliente cliente,Tipo tipo) {
		GestorUnificado gestorU = new GestorUnificado(tipo.pedido);
		Pedido pedidobusca = new Pedido(idPedido, cliente, new ArrayList());
		File archivo = new File(tipo.getRuta());
		if(archivo.exists()){
			Pedido pedidoEncontrado = (Pedido) new Varios().leerPedido(tipo.getRuta(), pedidobusca, true);
			return pedidoEncontrado;
		}
		return new Pedido("fail", new Cliente("", "", ""), new ArrayList<>());
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
