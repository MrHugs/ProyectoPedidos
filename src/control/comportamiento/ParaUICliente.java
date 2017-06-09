package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.logica.Consulta;
import modelo.Cliente;
import utiles.Tipo;
import vista.UICliente;

public class ParaUICliente extends UICliente {
	

	public ParaUICliente(){
		Consulta consulta = new Consulta();
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = consulta.consultaCliente(txtBuscaCliente.getText().toString(), Tipo.cliente);
				txtClienteEncontrado.setText("DNI: "+cliente.getDni()+"   Nombre: "+cliente.getNombre()+"   Descripcion: "+cliente.getDescripcion());
			}
		});
		
		
		
		
		
	
		
		
		
	}
	
	
	
}
