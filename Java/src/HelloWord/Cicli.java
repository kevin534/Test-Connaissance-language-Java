package HelloWord;

import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<  101; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		
		int[] valori = { 12,45,
				67,97,96, 89,97};
		
		int ricerca = 97;
		boolean flag = false;
		
		
		for(int i = 0;i<  valori.length; i++) {
			if(valori[i] == ricerca) {
				flag = true;
				break;
			}
			
		}
		if(flag) {
			System.out.println("ecco: " + ricerca);
		}
		else {
			System.out.println("dati not found");
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Quanti asterischi vuoi inserire");
		Scanner s = new Scanner(System.in);
		int numAsterischi = s.nextInt();
		
		for(int i = 0;i < numAsterischi; i++ ) {
			
			System.out.println("*");
		}

		int count = 2;
		
		while(count <11) {
			System.out.println("count is:  " + count);
			count++;
		}
		
		int mounth = 1;
		
		String mese;
		switch(mounth) {
		
		case 1: mese = "january";
		break;
		case 2: mese = "febbruary";
		break;
		default: mese = "invalid";
		break;
		
		
		}
		
		System.out.println("il coso è : " + mese);
		
		
		int tmp = 3;
		
		do {
			System.out.println("il contatore è : " + tmp);
			tmp++;
		}while(tmp < 12);
		
		int eta;
		
		do {
			System.out.println(" input the eta");
			 eta = s.nextInt();
		}while(eta <= 0);
		
		System.out.println("ok, la tua eta è : " + eta);
	}
	
	
	
	
	
}