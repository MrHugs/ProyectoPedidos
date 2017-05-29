package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Logica.antigua.GestorListas;
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
		lista.add(new Cliente("1", "Ataulfo"));
		lista.add(new Cliente("2", "Humberto"));
		lista.add(new Cliente("3", "Jeremias"));
		lista.add(new Cliente("4", "Diocleciano"));
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
