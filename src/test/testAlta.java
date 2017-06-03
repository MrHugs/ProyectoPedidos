package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import control.adaptador.Altas;
import control.adaptador.Consulta;
import control.adaptador.GestorUnificado;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import modelo.lineaPedido;
import utiles.Tipo;

public class testAlta {

	Altas alta = new Altas();
	Cliente cliente = new Cliente("1", "Manolo Pajares","mu bonico");
	Articulo articulo = new Articulo("1", "palo", 20f, "UN PALOOOOO!!");
	Articulo articulo2 = new Articulo("2", "zapatillas", 2000f, "yeah");
	ArrayList listaLineaPedidos = new ArrayList();
	
	
	
	@Test
	public void testAltaCliente() {
		GestorUnificado gestorU = new GestorUnificado(Tipo.cliente);
		assertTrue(alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDescripcion(), Tipo.cliente));
		ArrayList listaCLientes = (ArrayList) gestorU.obtener();
		assertTrue(listaCLientes.contains(cliente));	
		
		
	}

	@Test
	public void testAltaArticulo() {
		GestorUnificado gestorU = new GestorUnificado(Tipo.articulo);
		assertTrue(alta.altaArticulo(articulo.getIdentificador(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articulo));
		ArrayList listaArticulos = (ArrayList) gestorU.obtener();
		assertTrue(listaArticulos.contains(articulo));
	}

	

	@Test
	public void testAltaPedido() {
		GestorUnificado gestorU = new GestorUnificado(Tipo.pedido);
		listaLineaPedidos.add(new lineaPedido("1", articulo, 12));
		listaLineaPedidos.add(new lineaPedido("2", articulo2, 22));
		Pedido pedido = new Pedido("1", cliente, listaLineaPedidos);
		assertTrue(alta.altaPedido(pedido.getId(), pedido.getCliente(), pedido.getListaLineasPedidos(), Tipo.pedido));
		assertTrue(pedido.equals((Pedido)gestorU.obtener()));
		
		
		
		
		
	}
	
	

}
