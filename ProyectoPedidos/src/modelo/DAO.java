package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import control.adaptador.GestorUnificado;
import utiles.Constantes;
import utiles.Tipo;

public class DAO {
	ObjectInputStream adaptadorLectura = null;

	/**
	 * graba un objeto serialziado con sobreescritura en el archivo definido en
	 * el path
	 * 
	 * @param obj
	 *            lo que graba
	 * @param path
	 *            donde lo graba
	 * @return true si consigue grabar satisfactoriamente false en caso
	 *         contrario
	 */
	public boolean grabar(Object obj, String path, boolean unico) {
		File archivo = new File(path);
		FileOutputStream flujoW = null;
		ObjectOutputStream adaptadorW = null;
		// El archivo no existia cuando entro en el metodo
		// es cuando inicial=false;
		boolean inicial = false;
		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
				inicial = true;
			}
			// este flujo es de sobreescritura
			// flujoW = new FileOutputStream(archivo);
			// este añade
			flujoW = new FileOutputStream(archivo, !unico);
			if (unico || inicial)
				adaptadorW = new ObjectOutputStream(flujoW);
			else
				adaptadorW = new MyObjectOutputStream(flujoW);
			adaptadorW.writeObject(obj);
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
			return false;
		}
		try {
			adaptadorW.close();
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param path
	 * @param unico
	 *            true soy una lista y false muchos elementos
	 * @return
	 */
	public Object leer(String path, boolean unico) {
		File archivo = new File(path);
		Object socio = null;
		try {
			// este es el if que controla si el flujo debe abrirse o no
			if (unico || adaptadorLectura == null) {
				FileInputStream flujoEntrada = new FileInputStream(archivo);
				adaptadorLectura = new ObjectInputStream(flujoEntrada);
			}
			socio = adaptadorLectura.readObject();
			// este controla si debe cerrarse o no
			if (unico)
				adaptadorLectura.close();
			else {
				// si tras una operacion de lectura el resultado ha sido null
				// implica ue el flujo ha llegado al final del fichero
				if (socio == null) {
					adaptadorLectura.close();
				}
			}

		} catch (FileNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		}
		return socio;
	}

	public void cerrar() {
		try {
			adaptadorLectura.close();
		} catch (IOException e) {

		}

	}

	public boolean borrar(int encontrado, String ruta, boolean lista) {
		File antiguo = new File(ruta);
		File nuevo = new File("respaldo.bak");
		Object obtenido = leer(ruta, lista);
		int contador = 0;
		while (obtenido != null) {
			// antews de escribir hay que comprobar que sea el elemento
			// concreto
			// que indica el elemento encontrado
			if (encontrado == contador)
				// con esta orden salto un objeto y no lo grabo
				obtenido = leer(ruta, lista);
			if (obtenido != null)
				grabar(obtenido, ruta, lista);
			contador++;
			obtenido = leer(ruta, lista);
		}
		// tendriamos que renombrar el archivo nuevo y borrar el antiguo
		//aqui borramos el ficheor fisico no el objeto file que se ha creado 
		//con una ruta a un elemento que puede existir o no
		antiguo.delete();
		return nuevo.renameTo(antiguo);
	}
}
