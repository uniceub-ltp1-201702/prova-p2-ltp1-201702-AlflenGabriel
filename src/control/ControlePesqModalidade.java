package control;

import java.util.ArrayList;

import model.BD;
import model.Esportes;
import view.ViewExibirEsportes;
import view.ViewModalidadePEsporte;
import view.ViewSolicitarEsporte;


public class ControlePesqModalidade {
	
	private BD bd;
	
	public ControlePesqModalidade(BD bd){
		//Guardar o BDSimulado
		this.bd = bd;
	}
	
	//Metodo para pesquisar usuario
	public void pesquisarModalidade(){
		
		//Criar a view para solicitar a matricula
		ViewSolicitarEsporte vse = new ViewSolicitarEsporte();
		
		//Recuperando a matricula digitada pelo usuario
		String esporte = vse.getEsporte();
		
		//Retornar dados de usuario de acordo com a matricula
		ArrayList<String> esp = this.bd.ModPEsporte(esporte);
		
		//Exibir os dados do usuario
		ViewModalidadePEsporte vme = new ViewModalidadePEsporte();
	}

}



