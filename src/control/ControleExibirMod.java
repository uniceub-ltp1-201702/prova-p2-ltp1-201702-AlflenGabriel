package control;
import java.util.ArrayList;

import model.BD;
import model.Esportes;

import view.ViewExibirEsportes;

public class ControleExibirMod {
	

		//Atributos
		private BD bd;
		private ViewExibirEsportes vee;

		//Metodo construtor
		public void ControleExibirEsportes(BD bd) {
			this.bd = bd;
			//Instanciar a view
			this.vee = new ViewExibirEsportes();
		}
		
		//Metodo que recupera os clientes e exibe
		public void exibirEsportes(){
			//Retornar o ArrayList de Clientes
			ArrayList<Esportes> esportes = this.bd.getEsporte();
			//Executar o metodo para exibir todos os clientes
			this.vee.exibirEsportes(esportes);
		}
		

	}
