package Istanze;

import java.util.Scanner;

import interfacce.Figura;



public class Istanze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura;

		Scanner s = new Scanner (System.in);

		System.out.println("Desideri creare un Quadrato oppure un Rettangolo or un Triangolo?");

		String scelta = s.next();

		if(scelta.length()!= 1) {
			System.out.println("Scelta non valida...........");

		}
		else {
			if(scelta.toUpperCase().equals("Q")) {
				// costruisco il quadrato
				System.out.println("Inserisci il valore del lato del quadrato per il calcolo dell'area: ");
				float lato = s.nextInt();
				System.out.println("Il lato del Quadrato è:" + lato);
				figura= new Quadrato(lato);


				System.out.println(figura.CalcolArea());

			}

			else if(scelta.toUpperCase().equals("R")) {
				// costruisco il rettangolo
				System.out.println("Inserisci il valore del lato a: ");
				float a =  s.nextInt();
				System.out.println("Inserisci il valore del lato b: ");
				float b = s.nextInt();

				System.out.println("Rettangolo di lato:" + a +"e altezza: " +b);
				figura = new Rettangolo(a,b);
				Rettangolo R1 = new Rettangolo(1,3);
				//float base = R1.base;
				System.out.println(figura.CalcolArea());
			}
			else if(scelta.toUpperCase().equals("T")) {
				// costruisco il triangolo
				System.out.println("Inserisci il valore del lato a: ");
				float a =  s.nextInt();
				System.out.println("Inserisci il valore del lato b: ");
				float b =  s.nextInt();
				System.out.println("Inserisci il valore del lato c: ");
				float c =  s.nextInt();
				System.out.println("Tirangolo di lati a:" + a +"  b: " + b + " c: " + c);
				figura = new Triangolo(a,b,c);
				System.out.println("l 'area del triangolo è: " +figura.CalcolArea());
				
			}
			else {
				// inizializzazione di default
				figura = new Quadrato(3);
				System.out.println("Scelta non valida ....");
			}
			figura.Stampa();
			figura.CalcolArea();
			figura.NaturFigura();
		}
	}

}
