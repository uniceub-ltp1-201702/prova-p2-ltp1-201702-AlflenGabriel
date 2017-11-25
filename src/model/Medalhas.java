package model;

public class Medalhas {
	
	private String pais;
	private int MdeOuro;
	private int MdePrata;
	private int MdeBronze;
	private int PosRanking;

	
	public Medalhas(String pais, int mdeOuro, int mdePrata, int mdeBronze, int posRanking) {
		
		this.pais = pais;
		MdeOuro = mdeOuro;
		MdePrata = mdePrata;
		MdeBronze = mdeBronze;
		PosRanking = posRanking;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public int getMdeOuro() {
		return MdeOuro;
	}


	public void setMdeOuro(int mdeOuro) {
		MdeOuro = mdeOuro;
	}


	public int getMdePrata() {
		return MdePrata;
	}


	public void setMdePrata(int mdePrata) {
		MdePrata = mdePrata;
	}


	public int getMdeBronze() {
		return MdeBronze;
	}


	public void setMdeBronze(int mdeBronze) {
		MdeBronze = mdeBronze;
	}


	public int getPosRanking() {
		return PosRanking;
	}


	public void setPosRanking(int posRanking) {
		PosRanking = posRanking;
	}
	
	

}
