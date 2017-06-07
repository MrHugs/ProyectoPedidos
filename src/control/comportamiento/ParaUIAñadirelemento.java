package control.comportamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.adaptador.Altas;
import vista.UIAñadirelemento;

public class ParaUIAñadirelemento extends UIAñadirelemento {
	
	public ParaUIAñadirelemento(){
		Altas alta = new Altas();
		
		btnAñadirElemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		
		
		
		
	}
	

}
