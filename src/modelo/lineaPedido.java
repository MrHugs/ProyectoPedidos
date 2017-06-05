package modelo;

import java.io.Serializable;

public class lineaPedido implements Serializable{
	
	
String numeroLinea;
Articulo articulo;
int cantidad;




public lineaPedido(String numeroLinea, Articulo articulo, int cantidad) {
	super();
	this.numeroLinea = numeroLinea;
	this.articulo = articulo;
	this.cantidad = cantidad;
	
}




public String getNumeroLinea() {
	return numeroLinea;
}




public Articulo getArticulo() {
	return articulo;
}




public int getCantidad() {
	return cantidad;
}

}
