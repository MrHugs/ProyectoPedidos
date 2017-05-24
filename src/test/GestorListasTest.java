//package test;
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import Logica.antigua.GestorListas;
//import modelo.Persona;
//
//public class GestorListasTest {
//	String path="archivito.fgd";
//
//	GestorListas instancia;
//	ArrayList<Persona> lista;
//	@Before
//	public void setUp() throws Exception {
//		instancia=new GestorListas();
//		lista=new ArrayList<Persona>();
//		lista.add(new Persona("1", "Ataulfo"));
//		lista.add(new Persona("2", "Humberto"));
//		lista.add(new Persona("3", "Jeremias"));
//		lista.add(new Persona("4", "Diocleciano"));
//		instancia.escrbirLista(lista, path);
//	}
//
//	@Test
//	public void testBorrarElemento() {
//		Persona borrador=new Persona("3", "");
//		assertTrue(instancia.borrarElemento(lista, borrador,path));
//		ArrayList<Persona> miLista=instancia.obtenerLista(path);
//		System.out.println();
//	}
//
//}
