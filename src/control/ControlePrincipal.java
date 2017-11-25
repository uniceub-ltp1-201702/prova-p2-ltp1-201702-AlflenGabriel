package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewPrincipal;

public class ControlePrincipal {
	//Atributos
	private BD bd;
	private ViewPrincipal vp;
	private ControlePesqModalidade cpm;
	private ControleModPEsporte mpe;
	
	
	//Metodo construtor
	public ControlePrincipal(){
		//Instanciar o objeto BDSimulado
		this.bd = new BD();
		//Instanciar a ViewPrincipal
		this.vp = new ViewPrincipal();
		//Criar controles
		this.cpm = new ControlePesqModalidade(this.bd);
	

		
	//Exibir a janela de opcoes pela primeira vez
		tratarOpcao(this.vp.getOpcao());
	}
	
	//Metodo para tratar a opçao do usuario
	public void tratarOpcao(String opcao){
		while (true) {
			switch (opcao) {
			case "1": this.cpm.pesquisarModalidade();				
					  break;
				
			case "2": JOptionPane.showMessageDialog(null, "Até breve!");
				      return;

			default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido!");
				     break;
			}
			
			//Exibir a janela de opcoes
			opcao = this.vp.getOpcao();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
