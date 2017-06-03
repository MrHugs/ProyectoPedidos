package control.adaptador;

import modelo.DAO;
import utiles.Tipo;

public class GestorUnificado {
	DAO dao;
	Tipo tipo;

	// obligo al que crea el objeto a decirme que tipo es
	public GestorUnificado(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	public boolean escribir(Object obj) {
		return new DAO().grabar(obj, tipo.getRuta(), tipo.isLista());
	}

	public Object obtener() {
		dao = new DAO();
		return dao.leer(tipo.getRuta(), tipo.isLista());
	}

	public void finalizar() {
		dao.cerrar();

	}

	public boolean borra(Object obj) {
		int posicion = busca(obj);
		if (posicion != -1)
			return new DAO().borrar(posicion, tipo.getRuta(), tipo.isLista());
		else
			return false;
	}

	public int busca(Object obj) {
		int contador = -1;
		Object comparador = null;
		boolean encontrado = false;
		// recorremos la estructura de persistencia hasta encontrar el elemento
		// a buscar
		// o llegar al final de la estructura
		do {
			contador++;
			comparador = obtener();
			encontrado = comparar(comparador, obj);
		} while (!encontrado && comparador != null);
		finalizar();
		if (!encontrado)
			return -1;
		else
			return contador;
	}

	private boolean comparar(Object comparador, Object obj) {
		return comparador.equals(obj);
	}

}
