/**
 * 
 */
package ch.hslu.oop.sw11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class with can do some file operations.
 * @author silvan
 *
 */
public class Editor {
	final Logger LOG = LogManager.getLogger(Editor.class);
	private String filename;
	
	/**
	 * Constructor for Class Editor
	 * @param filename as String.
	 */
	public Editor(final String filename) {
		this.filename = filename;
	}
	
	/**
	 * Write integer to binary file.
	 * @param integer value which should be written to binary file
	 */
	public void writeBinaryFile(int number) {
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
		    dos.writeInt(number);
		    dos.flush();
		}
		catch (IOException ioe) {
			LOG.error("File could not be written", ioe);
		}
	}
	
	/**
	 * Write ArrayList<double> to binary file.
	 */
	public void writeBinaryFile(TemperatureVerlauf verlauf) {
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
			for (Double t : verlauf.getTempValues()) {
				dos.writeDouble(t);
			}
			dos.flush();
		}
		catch (IOException e) {
			LOG.error("file could not be written!");
		}
	}
	
	/**
	 * Read integer value from binary file.
	 * @return int value from file
	 */
	public int readBinaryFile() {
		int readint = 0;
		try(final DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
			readint = dis.readInt();	
		}
		catch (IOException ex) {
			LOG.error("File could not be read", ex);
		}
		return readint;
	}
	
	/**
	 * Read ArrayList<Double> from binary file.
	 */
	@SuppressWarnings("unchecked")
	public void readBinaryTempVerlaufFromFile() {
		try(final DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
			while (dis.available() > 0) {
			    Double t = dis.readDouble();
			    LOG.info(t);
            }
		}
		catch (IOException ex) {
			LOG.error("File could not be read");
		}
	}
	
	
	/**
	 * Write string to a textbased file.
	 * @param string which should be written to file
	 */
	public void writeTextFile(String text) {
		try(PrintWriter pwr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), Charset.forName("UTF-8"))))) {
			pwr.println(text);
			pwr.flush();
		}
		catch (IOException ex) {
			LOG.error("file could not be written", ex);	
		}
		
	}
	
	/**
	 * Read string from textbased file.
	 * 
	 */
	public String readTextFile() {
		String returnline = " ";
		if (new File(filename).exists()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), Charset.forName("UTF-8")))) {
				String line;
				while ((line = br.readLine()) != null) {
					returnline = line;
				}
			}
			catch(IOException ex) {
				LOG.error("File could not be read.", ex);
			}
			return returnline;
		}
		else {
			LOG.error("File does not exist!");
			return null;
		}
		
		
	}
	/**
	 * Read a CSV file and log some information.
	 */
	public void logCSVFile() {
		if (new File(filename).exists()); {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
				String line = null;
				while ((line = br.readLine()) != null) {
					LOG.info(Double.valueOf(line.split(";")[2]));
					LocalDateTime timestamp = LocalDateTime.parse(line.split(";")[1],DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
					LOG.info(timestamp);
				}
			}
			catch (IOException ex) {
				LOG.error("Error");
			}
		}
	}

	

}
