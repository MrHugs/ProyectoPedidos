package control.adaptador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IConsultas {

	public Articulo consultaArticulo(String id, Tipo tipo);
	public Pedido consultaPedido(Pedido pedido);
	public Cliente consultaCliente(String id, Tipo tipo);
}
