package it.polito.tdp.anagrammi.model;

import java.util.*;

import it.polito.tdp.anagrammi.dao.DizionarioDAO;

public class Model {
	Ricorsione ricorsione = new Ricorsione();
	DizionarioDAO dao = new DizionarioDAO();

	public Set<String> getAnagrammi(String parola){
		return ricorsione.anagramma(parola);
		/*Set<String> paroleCorrette = new HashSet<String>();
		for(String s: anagrammi) {
			if(dao.isCorrect(s)) {
				paroleCorrette.add(s);
			}
		}
		return paroleCorrette;*/
	}
	
	/*public Set<String> getAnagrammiErrati(String parola){
		List<String> anagrammi =ricorsione.anagramma(parola);
		Set<String> paroleErrate = new HashSet<String>();
		for(String s: anagrammi) {
			if(!dao.isCorrect(s)) {
				paroleErrate.add(s);
			}
		}
		return paroleErrate;
	}*/
	public boolean isCorrect(String anagramma) {
		return dao.isCorrect(anagramma);
	}

}
