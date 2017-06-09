package control.logica;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IConsultas {

	public Articulo consultaArticulo(String id, Tipo tipo);
	public Pedido consultaPedido(String idPedido,Cliente cliente,Tipo tipo);
	public Cliente consultaCliente(String id, Tipo tipo);
}
