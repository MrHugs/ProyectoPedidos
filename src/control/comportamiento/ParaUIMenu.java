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
			UIAltas ventanaAltas = new UIAltas();
			ventanaAltas.setVisible(true);
		}
	});
	
	btnConsultas.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			UIConsultas ventanaConsultas = new UIConsultas();
			ventanaConsultas.setVisible(true);
		}
	});
	
	
	}
	
}
