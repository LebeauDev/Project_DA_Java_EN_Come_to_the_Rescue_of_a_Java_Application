package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
/**
 * Classe permettant de compter les occurences et de trier le fichier .txt
 * @author Marc Lebeau
 *
 */
public class SortSymptomsData {
	
	public TreeMap<String, Integer> sortingSymptomsData() throws IOException{
		
	

	ReadSymptomDataFromFile file = new ReadSymptomDataFromFile ("src/symptoms.txt");
	
	List<String> symptomsList = file.getSymptoms();
	
	TreeMap<String, Integer> symptomsTri =  new TreeMap<>();
	

	for (String symptom : symptomsList) {
		if (symptomsTri.containsKey(symptom)) { 
			symptomsTri.put(symptom, symptomsTri.get(symptom)+1);
		} else {
			symptomsTri.put(symptom, 1);
		}
	}
	return symptomsTri;
}

}
