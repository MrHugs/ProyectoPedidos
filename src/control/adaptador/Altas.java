package control.adaptador;

import java.util.ArrayList;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public class Altas implements IAltas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	

	@Override
	public boolean altaCliente(String dni, String nombre, String descripcion, Tipo tipo) {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public boolean altaArticulo(String identificador, String nombre, float prefio, String descripcion, Tipo tipo) {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public boolean altaPedido(String id, Cliente cliente, ArrayList listaLineaPedidos, Tipo tipo) {
		// TODO Auto-generated method stub
		return false;
	}





}
