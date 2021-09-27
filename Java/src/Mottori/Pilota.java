package Mottori;

public class Pilota {

	String nome;
	String cognome;
	String sopranome;
	int eta;
	
	public Pilota(String nome,String cognome,String sopranome,int eta) {
		// TODO Auto-generated constructor stub
		this.cognome=cognome;
		this.eta=eta;
		this.nome=nome;
		this.sopranome=sopranome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSopranome() {
		return sopranome;
	}

	public void setSopranome(String sopranome) {
		this.sopranome = sopranome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
}
