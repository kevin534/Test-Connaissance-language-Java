package classiAstratti;

public class Astratta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fiat500 auto1 = new Fiat500();
		System.out.println("La " +auto1.modello + "ha velocità max di " + auto1.VELOCITA_MAX);
		System.out.println("La " +auto1.modello + "ha velocità iniziale pari a  " + auto1.velocita);
	}

}
