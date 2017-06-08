package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.adaptador.Consulta;
import utiles.Tipo;
import vista.UICliente;

public class ParaUICliente extends UICliente {
	Consulta consulta = new Consulta();

	public ParaUICliente(){
		
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consulta.consultaCliente(txtBuscaCliente.getText(), Tipo.cliente);
			}
		});
		
		
		
		
		
	}
	
	
	
}
