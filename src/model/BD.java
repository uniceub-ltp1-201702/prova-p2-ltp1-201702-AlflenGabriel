package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	
	private ArrayList<Esportes> esportes;
	private ArrayList<Medalhas> medalhas;
	private String FileName = "esportes.txt";
	private String FileName2 = "medalhas.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	
	
    public ArrayList<String> ModPEsporte (String esporte){
    	ArrayList<String> resultado = new ArrayList<String>();
    	
    	for (int i = 0; i < this.esportes.size(); i++) {
    		if (this.esportes.get(i).getEsporte().equals(esporte)) {
				resultado.add(this.esportes.get(i).getModalidade());
			}
			
		}
    	return resultado; 
    	
    }
    
    public void carregarEsportes(){
		//Ler as linhas do arquivo
		ArrayList<String> linhas = this.dr.read(this.FileName);
		//Percorrer o ArrayList criando os clientes
		for (int i = 0; i < linhas.size(); i++) {
			//Separa a linha em um array de String
			String[] linhaEsporte = linhas.get(i).split(";");
			//Cria o Cliente com os dados da linha
			Esportes e = new Esportes(linhaEsporte[0], linhaEsporte[1]);
			//Coloca o Cliente no ArrayList
			this.esportes.add(e);
		}
	}
	
    
    
    
    
    
    public ArrayList<Esportes> getEsporte() {
		return esportes;
    }
		public ArrayList<Medalhas> getMedalhas() {
			return medalhas;
		}
	
	
	
	
	
	
	

}
