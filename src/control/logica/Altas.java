package control.logica;

import java.util.ArrayList;

import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public class Altas implements IAltas {
	public static void main(String[] args) {
		Cliente clientes = new Cliente("1", "Paco", "mew");
		Cliente clientes2 = new Cliente("2", "Raul", "DEW");
		Altas alta = new Altas();
		alta.altaCliente( clientes.getDni(),clientes.getNombre(), clientes.getDescripcion(), Tipo.cliente);
		alta.altaCliente( clientes2.getDni(),clientes2.getNombre(), clientes2.getDescripcion(), Tipo.cliente);

		alta.altaArticulo("1", "maracas", 2000f, "suenan", Tipo.articulo);
		alta.altaArticulo("2", "Vaso", 1.25f, "cristal", Tipo.articulo);

		alta.altaPedido("1", clientes, new ArrayList(), Tipo.pedido);
		alta.altaPedido("2", clientes2, new ArrayList(), Tipo.pedido);

		
		
	}


	@Override
	public boolean altaCliente(String dni, String nombre, String descripcion, Tipo tipo) {
		Cliente cliente = new Cliente(dni, nombre, descripcion);
		GestorUnificado gestorU = new GestorUnificado(tipo);
		ArrayList listacliente = (ArrayList) gestorU.obtener();
		if(listacliente==null)
			listacliente = new  ArrayList();
		if(!listacliente.contains(cliente)){
			
			listacliente.add(cliente);
			return gestorU.escribir(listacliente);
		}
		return false;
		
	}

	@Override
	public boolean altaArticulo(String identificador, String nombre, float prefio, String descripcion, Tipo tipo) {

		Articulo articulo = new Articulo(identificador, nombre, prefio, descripcion);
		GestorUnificado gestorU = new GestorUnificado(tipo);
		ArrayList listaArticulo = (ArrayList) gestorU.obtener();
		if(listaArticulo==null)
			listaArticulo = new  ArrayList<>();
		if(!listaArticulo.contains(articulo)){
			
			listaArticulo.add(articulo);
			return gestorU.escribir(listaArticulo);
		}
		return false;

	}

	@Override
	public boolean altaPedido(String id, Cliente cliente, ArrayList listaLineaPedidos, Tipo tipo) {
		Pedido pedido = new Pedido(id, cliente, listaLineaPedidos);
		GestorUnificado gestorU = new GestorUnificado(tipo);
		return gestorU.escribir(pedido);
	}

}
