package view;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import model.Esportes;


public class ViewExibirEsportes {
	


		//Metodo para exibir todos os clientes
		public void exibirEsportes(ArrayList<Esportes> esportes){
			//Instanciar String para exibicao
			String todosEsportes = "";
			//Percorrer o ArrayList
			for (int i = 0; i < esportes.size(); i++) {
				todosEsportes = todosEsportes + esportes.get(i).toString() + "\n";
			}
			//Exibir todos os clientes
			JOptionPane.showMessageDialog(null, todosEsportes);
		}
	


}
