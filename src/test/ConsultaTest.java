package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import control.adaptador.Altas;
import control.adaptador.Consulta;
import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Cliente;
import utiles.Tipo;

public class ConsultaTest {
	
	Consulta consulta = new Consulta();
	Altas alta = new Altas();
	
	

	@Ignore
	public void testConsultaPedido() {
		
	}

	@Test
	public void testConsultaCliente() {
		Cliente cliente  = new Cliente("2", "PACO", "Mi padre");
		alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDescripcion(), Tipo.clienteTest);
		assertTrue(cliente.equals(consulta.consultaCliente("2", Tipo.clienteTest)));
	}

	@Test
	public void testConsultaArticulo() {
		Articulo articulo = new Articulo("1", "Manzana", 20f, "mu ricas");
		alta.altaArticulo(articulo.getIdentificador(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articuloTest);
		assertTrue(articulo.equals(consulta.consultaArticulo("1", Tipo.articuloTest)));
		
	}

}
