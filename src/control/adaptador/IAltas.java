package control.adaptador;

import java.util.ArrayList;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public interface IAltas {

public boolean altaArticulo(String identificador,String nombre, float prefio, String descripcion,Tipo tipo);
public boolean altaPedido(String id, Cliente cliente, ArrayList listaLineaPedidos,Tipo tipo);
public boolean altaCliente(String dni,String nombre,String descripcion,Tipo tipo);
}
