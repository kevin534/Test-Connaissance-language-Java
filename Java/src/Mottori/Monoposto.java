package Mottori;

public class Monoposto extends VeicoloDaGara{

	String modello;
	int cavali;
	
	public Monoposto(int numero, String modello, int cavali) {
		// TODO Auto-generated constructor stub
		this.cavali=cavali;
		this.modello=modello;
		setNumero(numero);
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCavali() {
		return cavali;
	}

	public void setCavali(int cavali) {
		this.cavali = cavali;
	}
}
