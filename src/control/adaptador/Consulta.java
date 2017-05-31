package control.adaptador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public class Consulta implements IConsultas {

	

	@Override
	public boolean consultaPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente consultaCliente( String id, Tipo tipo) {
		Cliente cliente = null;
		// TODO Auto-generated method stub
		return cliente;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean consultaArticulo(String id, Tipo tipo) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
