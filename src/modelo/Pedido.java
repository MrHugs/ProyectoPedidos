package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido  implements Serializable{
String id;
Cliente cliente;
ArrayList listaLineasPedidos = new ArrayList();

public Pedido(String id, Cliente cliente, ArrayList listaLineasPedidos) {
	super();
	this.id = id;
	this.cliente = cliente;
	this.listaLineasPedidos = listaLineasPedidos;
}


@Override
public boolean equals(Object obj) {
//	System.out.println("soy el equals de persona");
	return (this.id.equals(((Pedido)obj).id) && this.cliente.equals(((Pedido)obj).cliente));
}

public String getId() {
	return id;
}

public Cliente getCliente() {
	return cliente;
}

public ArrayList getListaLineasPedidos() {
	return listaLineasPedidos;
}


}
