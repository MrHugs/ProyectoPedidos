package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import control.adaptador.Altas;
import control.adaptador.Consulta;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;

public class testAlta {
	
	Altas alta = new Altas();
	Consulta consulta = new Consulta();
	
	
	
	
	
	
	
	
	@Test
	public void testAltaArticulo() {
		Articulo articulo = new Articulo("1","el",20f,"muy chachi");
		Articulo articulo2 = new Articulo("2","la",40f,"piojoso");
		Articulo articulo3 = new Articulo("3","los",5f,"tengo hambre");
		assertTrue(alta.altaArticulo(articulo, Tipo.articulo));
		assertTrue(alta.altaArticulo(articulo2, Tipo.articulo));
		assertTrue(alta.altaArticulo(articulo3, Tipo.articulo));
		assertTrue(articulo.equals(consulta.consultaArticulo("1",Tipo.articulo)));
		assertTrue(articulo.equals(consulta.consultaArticulo("2",Tipo.articulo)));
		assertTrue(articulo.equals(consulta.consultaArticulo("3",Tipo.articulo)));


	}
	@Test
	public void testAltaCliente() {
		Cliente cliente = new Cliente("1", "Manolo Pajares");
		assertTrue(alta.altaCliente(cliente, Tipo.cliente));
		assertTrue(cliente.equals(consulta.consultaCliente("1", Tipo.cliente)));
		}
	@Test
	public void testAltaPedido() {
		Pedido pedido = new Pedido();	}

}
