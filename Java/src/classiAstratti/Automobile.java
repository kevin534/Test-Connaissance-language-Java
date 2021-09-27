package classiAstratti;

public abstract class Automobile {

	// non è istanziabile
	
	String modello;
	int velocitaMassima;
	int velocita;
	
	public Automobile(String modello) {
		this.modello=modello;
		this.velocita= 0;
	}
	
	void ferma() {
		this.velocita= 0;
	}
	abstract void corri();
}
