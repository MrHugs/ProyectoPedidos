package control.comportamiento;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import vista.UIAltas;
import vista.UIConsultas;
import vista.UIMenu;

public class ParaUIMenu extends UIMenu {

	public ParaUIMenu(){
	
		
	
	btnAltas.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ParaUIAltas ventanaAltas = new ParaUIAltas();
			ventanaAltas.setVisible(true);
		}
	});
	
	btnConsultas.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			ParaUIConsultas ventanaConsultas = new ParaUIConsultas();
			ventanaConsultas.setVisible(true);
		}
	});
	
	
	}
	
}
