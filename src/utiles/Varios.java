package utiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pedido;

public class Varios {

	ObjectInputStream adaptadorLectura = null;

	public Object leerPedido(String path,Object obj ,boolean unico) {
		File archivo = new File(path);
		Pedido socio = null;
		boolean encontrado=false;
		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			if (unico || adaptadorLectura == null) {
				if (archivo.length() > 0) {
					FileInputStream flujoEntrada = new FileInputStream(archivo);
					adaptadorLectura = new ObjectInputStream(flujoEntrada);
					do{
						socio = (Pedido) adaptadorLectura.readObject();
						encontrado=socio.equals(obj);
					}while(encontrado==false && socio!=null);
					
					// este controla si debe cerrarse o no
					if (unico)
						adaptadorLectura.close();

					else {
						// si tras una operacion de lectura el resultado ha sido
						// null
						// implica ue el flujo ha llegado al final del fichero
						if (socio == null) {
							adaptadorLectura.close();
						}
					}
				}else{
					socio = new Pedido("noEncontrado", new Cliente("0", "NoExiste", ""), new ArrayList());
				}
			}
		} catch (FileNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (IOException e) {
			socio = new Pedido("noEncontrado", new Cliente("0", "NoExiste", ""), new ArrayList());

			if (Constantes.errores)
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		}
		return socio;
	}
}
