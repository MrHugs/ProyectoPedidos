package control.adaptador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IConsultas {

	public boolean consultaArticulo(String id, Tipo tipo);
	public boolean consultaPedido(Pedido pedido);
	public Cliente consultaCliente(String id, Tipo tipo);
}
