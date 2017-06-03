package Logica.antigua;

import modelo.DAO;

//La clase que sabe si el archivo va a ser de objetos o de lista es el gestor
//Por lo tanto mi primera solucion es crear un gestor diferente para cada tipo
public class GestorObjetos {
	boolean unico = false;

	public boolean escrbirObjeto(Object obj, String path) {
		return new DAO().grabar(obj, path, unico);
	}

	public Object obtenerObjeto(String path) {
		return new DAO().leer(path, unico);
	}
}
