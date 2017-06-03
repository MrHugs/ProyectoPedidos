package control.logica;

import java.io.File;
import java.util.Set;

import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public class Gestor {

	/**
	 * Se encarga de borrar un elemento
	 * 
	 * @param obj
	 * @return
	 */
	private boolean borra(Object obj, Tipo tipo) {
		if (tipo.isLista()) {
			return borraL(obj, tipo);
		} else {
			return borraO(obj, tipo);
		}
	}

	private boolean borraO(Object obj, Tipo tipo) {
		GestorUnificado gestor = new GestorUnificado(tipo);
		return gestor.borra(obj);

	}

	private boolean borraL(Object obj, Tipo tipo) {
		// necesito hacer dos operaciones por eso creo un objeto
		GestorUnificado gestor = new GestorUnificado(tipo);
		// obtengo la lista del gestor
		Set lista = (Set) gestor.obtener();
		// borro el elemento de la lista
		boolean borrado = lista.remove(obj);
		// si lo borra bien debemos volver a grabar la nueva lista en el fichero
		if (borrado)
			gestor.escribir(lista);
		// retornamos el resultado de la operacion
		return borrado;
	}

	public boolean insertar(Cliente obj) {
		return escribe(obj, Tipo.cliente);
	}

	public boolean insertar(Articulo obj) {
		return escribe(obj, Tipo.articulo);
	}

	public boolean insertar(Pedido obj) {
		return escribe(obj, Tipo.pedido);
	}

	private boolean escribe(Object obj, Tipo tipo) {
		return new GestorUnificado(tipo).escribir(obj);
	}

	/**
	 * busca un objeto en un fichero
	 * 
	 * @param obj
	 *            el objeto a buscar
	 * @return el valor de la posicion enla que se encuentra o -1 si no existe
	 */
	public int buscar(Cliente cliente) {
		return busca(cliente, Tipo.cliente);
	}

	public int buscar(Articulo articulo) {
		return busca(articulo, Tipo.articulo);
	}

	public int buscar(Pedido pedido) {
		return busca(pedido, Tipo.pedido);
	}

	public int busca(Object obj, Tipo tipo) {
		if (tipo.isLista())
			return buscaLista(obj, tipo);
		else
			return buscaObjeto(obj, tipo);
	}

	/**
	 * busca un objeto del gestor y nos entrega una posicion que ocupa el objeto
	 * 
	 * @param obj
	 * @param tipo
	 * @return el numero de la posicion o -1 si no lo encuentra
	 */
	private int buscaObjeto(Object obj, Tipo tipo) {
		GestorUnificado buscador = new GestorUnificado(tipo);
		return buscador.busca(obj);
	}

	private int buscaLista(Object obj, Tipo tipo) {
		Set col = (Set) new GestorUnificado(tipo).obtener();
		if (col.contains(obj))
			return 0;
		else
			return -1;
	}

}
