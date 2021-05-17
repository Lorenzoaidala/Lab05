package it.polito.tdp.anagrammi.model;
import java.util.*;

public class ModelTest {
	
	public static void main(String[] args) {
			
		Model mode = new Model();
		List<String> esempio = mode.getAnagrammiCorretti("cane");
		List<String> esempio2 = mode.getAnagrammiErrati("cane");
		System.out.println(esempio);
		System.out.println(esempio2);
	}

}
