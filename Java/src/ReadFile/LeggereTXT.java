package ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggereTXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fileDaLeggere = new File("C:\\Users\\touka\\prova.txt");
		System.out.println(fileDaLeggere.exists());
		System.out.println(fileDaLeggere.isDirectory());
		System.out.println(fileDaLeggere.canRead());
		System.out.println(new File(".").getAbsolutePath());
	
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fileDaLeggere));
			String lineaSingola = "";
			
			while( (lineaSingola = br.readLine()) != null) {
				System.out.println(lineaSingola);
				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("il file non esiste");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
