package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import control.adaptador.GestorUnificado;
import modelo.Cliente;

import utiles.Tipo;

public class GestorUnificadoTest {
	GestorUnificado instancia;
	ArrayList<Cliente> lista;
	@Before
	public void setUp() throws Exception {
		
		instancia=new GestorUnificado(Tipo.cliente);
		lista=new ArrayList<Cliente>();
		lista.add(new Cliente("1", "Ataulfo","pos si"));
		lista.add(new Cliente("2", "Humberto","pos si"));
		lista.add(new Cliente("3", "Jeremias","pos si"));
		lista.add(new Cliente("4", "Diocleciano","pos si"));
		instancia.escribir(lista);
	}

	@Test
	public void test01Escribir() {
		fail("Not yet implemented");
	}

	@Test
	public void test02Obtener() {
		fail("Not yet implemented");
	}

}
