package HelloWord;

public class HelloWindows {
	
	public static void main(String[] args) {
		
		System.out.println("stampa element");
		
		//  camelcase
		byte variabileByte;
		variabileByte = 8;
		
		short varShort = 23;
		
		//cast
		byte risultato = (byte) (variabileByte + varShort);
		System.out.println("il numer che si vuole è " + risultato + ", e si puo concludere che ha "+ varShort);
		
		int numInt = 234567;
		
		float floatNumber = 2.4f;
		
		double doubleNumber = 4.0d;
		
		float anotherNumber = 23.03f;
		
		boolean theBool = true;
		theBool = false;
		
		Integer i = 8;
		
		int numeroUnboxing = i.intValue();// unboxing automatico
		String intput = "kevin";
		String output = "kin";
		if(intput.equals(output)) {
			System.out.println("il valore è " + intput );
		}
		else {
			System.out.println("errort");
		}
		System.out.println(numeroUnboxing );
		
		char carattere = 'g';
		
		final int theNumber = 99;
		
		 
		int primoNumero = 3;
		int secondoNumero = 32;
		
		float rapporto = (primoNumero / secondoNumero);
		int somma = primoNumero + secondoNumero;
		
		int prodotto = primoNumero * secondoNumero;
		
		System.out.println("il modulo è:" + (secondoNumero % primoNumero));
	}

}
