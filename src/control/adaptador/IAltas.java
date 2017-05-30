package control.adaptador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IAltas {
public boolean altaArticulo(Articulo articulo,Tipo tipo);
public boolean altaPedido(Pedido pedido,Tipo tipo);
public boolean altaCliente(Cliente cliente,Tipo tipo);
}
