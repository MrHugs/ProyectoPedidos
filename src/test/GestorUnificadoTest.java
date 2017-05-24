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
//import control.adaptador.GestorUnificado;
//import modelo.Persona;
//import utiles.Tipo;
//
//public class GestorUnificadoTest {
//	GestorUnificado instancia;
//	ArrayList<Persona> lista;
//	@Before
//	public void setUp() throws Exception {
//		
//		instancia=new GestorUnificado(Tipo.cliente);
//		lista=new ArrayList<Persona>();
//		lista.add(new Persona("1", "Ataulfo"));
//		lista.add(new Persona("2", "Humberto"));
//		lista.add(new Persona("3", "Jeremias"));
//		lista.add(new Persona("4", "Diocleciano"));
//		instancia.escribir(lista);
//	}
//
//	@Test
//	public void test01Escribir() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void test02Obtener() {
//		fail("Not yet implemented");
//	}
//
//}
