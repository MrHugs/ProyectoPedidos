package control.adaptador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IConsultas {

	public boolean consultaArticulo(Articulo articulo);
	public boolean consultaPedido(Pedido pedido);
	public boolean consultaCliente(Cliente cliente);
}
