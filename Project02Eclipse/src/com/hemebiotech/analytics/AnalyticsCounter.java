package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;
/**
 * @author Marc Lebeau
 * @version 1.0.0
 */
public class AnalyticsCounter {

	public static void main(String args[]) throws IOException  {
		
		SortSymptomsData sortSymptomsData = new SortSymptomsData();
		
		TreeMap <String, Integer> map = new TreeMap<String, Integer>();
		map = sortSymptomsData.sortingSymptomsData();
		
		for (Entry<String, Integer> entry : map.entrySet())
			System.out.println("Symptoms : " + entry.getKey() + ": " +entry.getValue());
		
		System.out.println("Number of different symptoms : "+map.size());
		
		FileWriterData fileWriterData = new FileWriterData();
		
			fileWriterData.writeSymptomsData();
		} 
		

	}

