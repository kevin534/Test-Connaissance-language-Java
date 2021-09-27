package Monza;

import java.util.ArrayList;
import java.util.Collections;

import Mottori.*;
public class Gara {
	
	ArrayList<Scuderia> partecipanti;
	ArrayList<Monoposto> automobili;

	public Gara() {
		this.automobili = new ArrayList<>();
		this.partecipanti = new ArrayList<>();
	}
	
	public void iscriviScuderia(Scuderia s) {
		this.partecipanti.add(s);	
		}
	
	public void creaGrigliaDiPaertenza() {
		
		for(Scuderia s : this.partecipanti) {
			this.automobili.add(s.getMonoposto()[0]);
			this.automobili.add(s.getMonoposto()[1]);
		}
		
		Collections.shuffle(this.automobili);
	}
	
	public void visualizzaGriglia() {
		int index = 1;
		for(Monoposto a : this.automobili) {
			String nomePilota = "";
			for(Scuderia s : this.partecipanti) {
				
				Monoposto[] autoDellaScuderia = s.getMonoposto();
				Pilota[] teamDellaScuderia = s.getTeam();
				if(autoDellaScuderia[0].equals(a)) {
					nomePilota = teamDellaScuderia[0].getNome();
				}
				if(autoDellaScuderia[1].equals(a)) {
					nomePilota = teamDellaScuderia[1].getNome();
				}
				System.out.println( index + " - " + a.getModello() + " [" + a.getNumero() + "] - " + nomePilota);
			}
			index++;
		}
	}
	
	
	public void avviaGara() {
		
		System.out.println("Pronti... \nPartenza....\nVIA !!!");
	}
	
	public void generaOrdineDiArrivo() {
		
		Collections.shuffle(this.automobili);
	}
	
}
