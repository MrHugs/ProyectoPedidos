package modelo;

import java.io.Serializable;

public class Articulo implements Serializable {
	
String identificador;
String nombre;
float precio;
String descripcion;

public Articulo(String identificador, String nombre, float precio, String descripcion) {
	super();
	this.identificador = identificador;
	this.nombre = nombre;
	this.precio = precio;
	this.descripcion = descripcion;
}

@Override
public boolean equals(Object obj){
	return this.identificador.equals(((Articulo)obj).identificador);
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.nombre+","+this.precio);
	}

public String getIdentificador() {
	return identificador;
}

public String getNombre() {
	return nombre;
}

public float getPrecio() {
	return precio;
}

public String getDescripcion() {
	return descripcion;
}



}
