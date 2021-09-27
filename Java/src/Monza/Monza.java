package Monza;

import java.util.ArrayList;

import Mottori.Pilota;
import Mottori.Scuderia;
import Mottori.Sponsor;

public class Monza {

	// software per simulare una gara
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creare i piloti 
		
		ArrayList<Pilota> piloti = new ArrayList<Pilota>();
		
		piloti.add(new Pilota("Paolo", "Cavilorar", "Fernando", 34));
		piloti.add(new Pilota("Giaccomo", "Kevin", "Ernesto", 27));
		piloti.add(new Pilota("SATEFANO", "Gianluca", "Pietro", 30));
		piloti.add(new Pilota("Xavier", "Toukam", "Stevy", 31));
		
		// creare , i sponsor
		
		ArrayList<Sponsor> sponsor = new ArrayList<Sponsor>();
		
		sponsor.add(new Sponsor("Shell Petroli", 12345f));
		sponsor.add(new Sponsor("Red Bull", 86755f));
		
		// creare le scuderie
		
		ArrayList<Scuderia> scuderia = new ArrayList<Scuderia>();
		
		scuderia.add(new Scuderia("Ferrari", sponsor.get(0)));
		scuderia.add(new Scuderia("Mercedes", sponsor.get(1)));
		
		// reclutamento piloti
		scuderia.get(0).reclutaPiloti(piloti);
		scuderia.get(1).reclutaPiloti(piloti);
		
		// pARTECIPANTI DELLA GARA
		
		for(Scuderia s : scuderia) {
			System.out.println(s.getNome());
		}
		
		// avviare la gara
		
		Gara gara = new Gara();
		gara.iscriviScuderia(scuderia.get(0));
		gara.iscriviScuderia(scuderia.get(1));
		gara.creaGrigliaDiPaertenza();
		System.out.println("NUOVA GARA");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("GRIGLIA DI PARTENZA : ");
		gara.visualizzaGriglia();
		
		gara.avviaGara();
		System.out.println("Ordine di Arrivo : ");
		gara.generaOrdineDiArrivo();
		gara.visualizzaGriglia();
		

	}

}
