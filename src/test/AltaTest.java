package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;

import control.adaptador.Altas;
import control.adaptador.Consulta;
import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import modelo.lineaPedido;
import utiles.Tipo;

public class AltaTest {

	Altas alta = new Altas();
	
	Articulo articulo2 = new Articulo("2", "zapatillas", 2000f, "yeah");
	ArrayList listaLineaPedidos = new ArrayList();
	
	
	
	@Test
	public void testAltaCliente() {
		GestorUnificado gestorU = new GestorUnificado(Tipo.clienteTest);
		Cliente cliente = new Cliente("1", "Manolo Pajares","mu bonico");
		Cliente cliente2 = new Cliente("2", "xxxxxxxxxxxxx","xxxxxxxxx");
		assertTrue(alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDescripcion(), Tipo.clienteTest));
		assertTrue(alta.altaCliente(cliente2.getDni(), cliente2.getNombre(), cliente2.getDescripcion(), Tipo.clienteTest));

		ArrayList listaCLientes = (ArrayList) gestorU.obtener();
		assertTrue(listaCLientes.contains(cliente));
		assertTrue(listaCLientes.contains(cliente2));	

		
		
	}

	@Test
	public void testAltaArticulo() {
		GestorUnificado gestorU = new GestorUnificado(Tipo.articuloTest);
		Articulo articulo = new Articulo("1", "palo", 20f, "UN PALOOOOO!!");
		assertTrue(alta.altaArticulo(articulo.getIdentificador(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articuloTest));
		ArrayList listaArticulos = (ArrayList) gestorU.obtener();
		assertTrue(listaArticulos.contains(articulo));
	}

	

	@Test
	public void testAltaPedido() {
		GestorUnificado gestorU = new GestorUnificado(Tipo.pedidoTest);
		listaLineaPedidos.add(new lineaPedido("2", articulo2, 22));
		Cliente cliente = new Cliente("1", "Manolo Pajares","mu bonico");
		Pedido pedido = new Pedido("1", cliente, listaLineaPedidos);
		assertTrue(alta.altaPedido(pedido.getId(), pedido.getCliente(), pedido.getListaLineasPedidos(), Tipo.pedidoTest));
		assertTrue(pedido.equals((Pedido)gestorU.obtener()));
	}
	
	

}
