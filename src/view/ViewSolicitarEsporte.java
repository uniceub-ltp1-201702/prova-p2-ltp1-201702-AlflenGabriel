package view;

import javax.swing.JOptionPane;

public class ViewSolicitarEsporte {
	
	

	
		//Atributos
		private String esporte;
		
		public ViewSolicitarEsporte(){
			this.esporte =
					JOptionPane.showInputDialog("Digite o esporte:");
		}

		public String getEsporte() {
			return esporte;
		}
		
	


}
