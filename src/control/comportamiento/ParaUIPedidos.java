package control.comportamiento;

import modelo.Cliente;
import modelo.Pedido;
import utiles.Tipo;
import vista.UIPedidos;
import java.awt.event.ActionListener;

import control.logica.Consulta;

import java.awt.event.ActionEvent;

public class ParaUIPedidos extends UIPedidos {

	public ParaUIPedidos(){
		
		Consulta consulta = new Consulta();

		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido pedido = consulta.consultaPedido(txtBuscaPedido.getText(),new Cliente("","",""), Tipo.pedidoTest);
				textAreaInfoPedido.setText("ID: "+pedido.getId()+" Cliente: "+pedido.getCliente().toString());
//				textAreaInfoPedido.setText("\n");
//				textAreaInfoPedido.setText("\n");
				//textAreaInfoPedido.setText(pedido.getListaLineasPedidos().toString());

			}
		});
		
		
		
		
	}
}
