package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import modelo.Cliente;
import vista.UIAltas;

public class ParaUIAltas extends UIAltas{
	public ParaUIAltas(){
		comboCliente = new JComboBox();
		Cliente cliente = new Cliente("4", "Juan","yu");
		Cliente cliente2 = new Cliente("5", "p","yu");
		comboCliente.addItem(cliente.toString());
		comboCliente.addItem(cliente2.toString());
		
		
		
	}
	}
