package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Classe permettant de lire un fichier .txt
 * @author Marc Lebeau
 *
 */

public class ReadSymptomDataFromFile implements ISymptomReader {//ReadSymptomsDataFromFile est implementée par ISymptomReader

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {//constructeur de la classe ReadSymptomDataFromFile avec son attribut
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() { //redefiition de la methode getSymptoms
		/**
		 * Renvoie les symptomes
		 * @return les symptomes
		 */
		List<String> result = new ArrayList<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				System.err.printf("Le fichier %s n'existe pas.", filepath.toString());
			}
		}
		
		return result;
	}
	

}


