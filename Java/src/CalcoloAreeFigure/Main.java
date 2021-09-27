package CalcoloAreeFigure;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Figure forma;
		 AreeFigure area;
			Scanner s = new Scanner (System.in);
			
			System.out.println("Desideri creare un Quadrato oppure un Rettangolo?");
			
			String scelta = s.next();
			
			if(scelta.length()!= 0) {
				System.out.println("Scelta non valida...........");
				
			}
			else {
				if(scelta.toUpperCase().equals("Q")) {
					// costruisco il quadrato
					System.out.println("Inserisci il valore del lato del quadrato per il calcolo dell'area: ");
					int lato = s.nextInt();
					System.out.println("Il lato del Quadrato è:" + lato);
					area  = new Quadrato(lato);
					
				}
				
				else if(scelta.toUpperCase().equals("R")) {
					// costruisco il rettangolo
					//forma = new Rettangolo(23.65f,12.45f);
				}
				
				else {
					System.out.println("Scelta non valida ....");
				}
				
			}
			
			

	}

}
