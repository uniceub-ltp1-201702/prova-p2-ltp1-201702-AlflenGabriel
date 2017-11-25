package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Esportes;


public class ViewModalidadePEsporte {
	

	public void exibirModPEsporte(ArrayList<Esportes> esportes){
		//Instanciar String para exibicao
		String modpEsporte = "";
		//Percorrer o ArrayList
		for (int i = 0; i < esportes.size(); i++) {
			modpEsporte = modpEsporte + esportes.get(i).getModalidade();
		}
		//Exibir todos os clientes
		JOptionPane.showMessageDialog(null, modpEsporte);
	}
	
	

}

