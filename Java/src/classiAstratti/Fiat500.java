package classiAstratti;

public class Fiat500 extends Automobile{

	public final int VELOCITA_MAX = 160;
	
	public 	Fiat500() {
		super("FIAT 500");
		this.velocitaMassima=VELOCITA_MAX;
	}
	@Override
	void corri() {
		// TODO Auto-generated method stub
		this.velocita=500;
		
	}

}
