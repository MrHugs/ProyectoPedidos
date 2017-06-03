package Logica.antigua;

import java.util.ArrayList;

import modelo.DAO;

public class GestorListas {
	boolean unico = true;
	// si declaramos el path como propiedad tenemos que usar un objeto por cada
	// elemento diferente que queremos gestionar
	// String path;

	// public GestorListas(String path) {
	// super();
	// this.path = path;
	// }
	// puesto el path como parametro puedo usar el mismo objeto
	// para guardar cualquier lista



	public boolean escrbirLista(ArrayList lista, String path) {
		return new DAO().grabar(lista, path,unico);
	}
	
	public ArrayList obtenerLista(String path) {
		return (ArrayList<Object>) new DAO().leer(path,unico);
	}

	public boolean borrarElemento(ArrayList lista, Object obj, String path) {
		if (lista.remove(obj))
			return escrbirLista(lista, path);
		else
			return false;
	}
}
