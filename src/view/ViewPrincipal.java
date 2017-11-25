package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//atributos
	private String opcao;
	
	//Metodo para exibir a lista de opcoes
	public String getOpcao(){
		this.opcao =  JOptionPane.showInputDialog(
				"Escolha uma opção\n" +
				"1 - Exbir Modalidades por Esporte\n" +
				"2 - Sair\n");
		
		return this.opcao;
	}

}
