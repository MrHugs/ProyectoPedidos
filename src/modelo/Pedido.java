package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido {
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
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pedido other = (Pedido) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
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
