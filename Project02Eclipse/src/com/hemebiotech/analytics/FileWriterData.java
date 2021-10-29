package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileWriterData {
	public void writeSymptomsData() throws IOException {
		try {

			SortSymptomsData symptomsSorting = new SortSymptomsData();

			FileWriter writer = new FileWriter("src/resultV5.out");
			
			TreeMap<String, Integer> symptoms = symptomsSorting.sortingSymptomsData();
			for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				writer.write(" "+entry.getKey() + " = " + entry.getValue()+" \r\n ");
				
				
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
