package modelo;

public class lineaPedido {
	
	
String numeroLinea;
String articulo;
int cantidad;




public lineaPedido(String numeroLinea, String articulo, int cantidad) {
	super();
	this.numeroLinea = numeroLinea;
	this.articulo = articulo;
	this.cantidad = cantidad;
	
}




public String getNumeroLinea() {
	return numeroLinea;
}




public String getArticulo() {
	return articulo;
}




public int getCantidad() {
	return cantidad;
}

}
