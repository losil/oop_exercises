/**
 * 
 */
package ch.hslu.oop.sw11;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Main Class with some basic file operations.
 * @author silvan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Logger LOG  = LogManager.getLogger(Main.class);
		String byteFile = "/var/tmp/byte_out";
		String textFile = "/var/tmp/text_out.txt";
		
		Editor textEditor  = new Editor(textFile);
		Editor byteEditor = new Editor(byteFile);
		
		textEditor.writeTextFile("text in file");
		byteEditor.writeBinaryFile(383);
		
		LOG.info("content of textfile:" + textEditor.readTextFile());
		LOG.info("content of binary file: " + byteEditor.readBinaryFile());
		
		TemperatureVerlauf tverlauf = new TemperatureVerlauf();
		String input;
		Scanner scanner = new Scanner(System.in); 
		do {
			LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
			input = scanner.next();
			try {
			    tverlauf.add(Temperature.createFromCelsius(Double.valueOf(input)));
			    
			} catch (NumberFormatException e ) {
				LOG.error("No double value inserted, continue program!");
			}
			
		} while (!(input.equals("exit")));
		
	scanner.close();
		
	Editor verlaufEditor = new Editor("/var/tmp/array_out");
	verlaufEditor.writeBinaryFile(tverlauf);
	LOG.info("Tempverlauf read from file:");
	verlaufEditor.readBinaryTempVerlaufFromFile();

	
	/*
	 * working with some basic operations on csv files.
	 */
	String tempcsv = "/Users/silvan/Dokumente/HSLU/1. Semester/OOP/sw11/netatmo-export-201608-201610.csv";
	if (new File(tempcsv).exists()) {
		LOG.info("File exists.");
		Editor csv = new Editor(tempcsv);
		//csv.logCSVFile();
	}
	
	/*
	 * Creating a TemperatureVerlauf Object and filling it with informations from csv file.
	 */
	TemperatureVerlauf verlauf = new TemperatureVerlauf();
	verlauf.addFromFile(tempcsv);
	LOG.info("Min Temp: " + verlauf.getMinTemp() + " @ "+ verlauf.getMinTime() + " ; Max Temp: " + verlauf.getMaxTemp() + " @ " + verlauf.getMaxTime()  + " ; Avg Temp: " + verlauf.getAverageTemp());
	
	LOG.info("Programm beendet");
	}
	
	

}
