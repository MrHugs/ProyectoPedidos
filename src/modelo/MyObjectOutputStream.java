package modelo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

	public MyObjectOutputStream(OutputStream out) throws IOException {
		// quiero que se quede como esta
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// Este es el que escribe la cabecera
		/*
		 * La solucion pasa por eliminar la escritura de la cabecera para
		 * objetos de mi tipo
		 */
		// super.writeStreamHeader();
//		System.out.println("soy la otra");
	}
}
