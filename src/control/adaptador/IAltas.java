package control.adaptador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IAltas {
public boolean altaArticulo(Articulo articulo);
public boolean altaPedido(Pedido pedido);
public boolean altaCliente(Cliente cliente);
}
