package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Logica.antigua.GestorListas;
import modelo.Cliente;


public class GestorListasTest {
	String path="archivito.fgd";

	GestorListas instancia;
	ArrayList<Cliente> lista;
	@Before
	public void setUp() throws Exception {
		instancia=new GestorListas();
		lista=new ArrayList<Cliente>();
		lista.add(new Cliente("1", "Ataulfo"));
		lista.add(new Cliente("2", "Humberto"));
		lista.add(new Cliente("3", "Jeremias"));
		lista.add(new Cliente("4", "Diocleciano"));
		instancia.escrbirLista(lista, path);
	}

	@Test
	public void testBorrarElemento() {
		Cliente borrador=new Cliente("3", "");
		assertTrue(instancia.borrarElemento(lista, borrador,path));
		ArrayList<Cliente> miLista=instancia.obtenerLista(path);
		System.out.println();
	}

}
