package Mottori;

import java.util.ArrayList;
import java.util.Random;

public class Scuderia {

	// contiene del monoposto , del sponsor , del pilota
	// è una classe di aggregazione

	private String nome;

	private Pilota[] team;

	private Sponsor sponsor;

	private Monoposto[] monoposto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pilota[] getTeam() {
		return team;
	}

	public void setTeam(Pilota[] team) {
		this.team = team;
	}

	public Sponsor getSponsor() {
		return sponsor;
	}

	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public Monoposto[] getMonoposto() {
		return monoposto;
	}

	public void setMonoposto(Monoposto[] monoposto) {
		this.monoposto = monoposto;
	}

	public Scuderia(String nome, Sponsor sponsor) {
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.sponsor=sponsor;
		// creo le monoposto

		this.monoposto= new Monoposto[2];
		this.monoposto[0] = new Monoposto((new Random()).nextInt(100), this.getNome() + " vettura 1" , 800);
		this.monoposto[1] = new Monoposto((new Random()).nextInt(100), this.getNome() + " vettura 2" , 546);
	}

	public void reclutaPiloti(ArrayList<Pilota> pilota) {

		this.team = new Pilota[2];
		this.team[0] = pilota.get(0);
		this.team[1] = pilota.get(1);
		this.team[1] = pilota.get(2);
		this.team[1] = pilota.get(3);
		/*if(pilota.size() == 2) {

			this.team[0] = pilota.get(0);
			this.team[1] = pilota.get(1);

		}*/
		/*else {
			int primoIndice = ((new Random()).nextInt(pilota.size() - 1));
			this.team[0] = pilota.get(primoIndice);
			pilota.remove(primoIndice);
			int secondoIndice = ((new Random()).nextInt(pilota.size() - 1));
			this.team[0] = pilota.get(secondoIndice);
			pilota.remove(secondoIndice);
		}*/
	}

	
}
