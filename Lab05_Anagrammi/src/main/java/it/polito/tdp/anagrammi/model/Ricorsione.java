package it.polito.tdp.anagrammi.model;
import java.util.*;

public class Ricorsione {

	List<String> anagrammi = new ArrayList<String>();
	
	public List<String> anagramma(String parola){
		List<Character> rimanenti = new ArrayList<Character>();
		for(int i =0; i<parola.length(); i++) {
			rimanenti.add(parola.charAt(i));
		}
		cerca("",0,rimanenti);
		return anagrammi;
	}

	public void cerca(String parziale, int livello, List<Character> rimanenti) {
		if(rimanenti.size()==0) {
			anagrammi.add(parziale);
		}

		for(Character c : rimanenti) {
			String newParziale = parziale +c;
			List<Character> newRimanenti = new ArrayList<Character>(rimanenti);
			newRimanenti.remove(c);
			this.cerca(newParziale, livello+1, newRimanenti);
			
		}
	}
}