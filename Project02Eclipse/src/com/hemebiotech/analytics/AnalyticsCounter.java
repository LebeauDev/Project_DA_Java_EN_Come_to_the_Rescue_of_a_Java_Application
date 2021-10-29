package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		SortSymptomsData sortSymptomsData = new SortSymptomsData();
		
		TreeMap <String, Integer> map = new TreeMap<String, Integer>();
		map = sortSymptomsData.sortingSymptomsData();
		
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("Symptoms : " + entry.getKey() + ": " +entry.getValue());
		
		FileWriterData fileWriterData = new FileWriterData();
		fileWriterData.writeSymptomsData();
		

	}
}
