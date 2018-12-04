/**
 * 
 */
package ch.hslu.oop.sw11;

import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author silvan
 *
 */
public class TemperatureVerlauf implements Comparable<TemperatureVerlauf> {
	private Collection<Temperature> verlauf = new ArrayList<>();
	private final List<TempPropertyChangeListener> changeListeners = new ArrayList<>();
	private TempState state;

	public TemperatureVerlauf() {
		state = TempState.NONE;

	}

	public final void add(Temperature temp) {
		this.verlauf.add(temp);
		if (temp.getTemperatureCelsius() > this.getMaxTemp()) {
			final TemperatureEvent pcEvent = new TemperatureEvent(this, "state", TempState.NONE, TempState.MAX);
			this.firePropertyChangeEvent(pcEvent);
		}

		if (temp.getTemperatureCelsius() < this.getMinTemp()) {
			final TemperatureEvent pcEvent = new TemperatureEvent(this, "state", TempState.NONE, TempState.MAX);
			this.firePropertyChangeEvent(pcEvent);
		}
	}

	/**
	 * Import Temperatures from file.
	 * 
	 * @param filename
	 */
	public void addFromFile(String filename) {
		if (new File(filename).exists()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
				String line = null;
				while ((line = br.readLine()) != null) {
					double temp = Double.valueOf(line.split(";")[2]);
					String timestamp = line.split(";")[1];

					add(Temperature.createFromCelsius(temp, timestamp));
				}
			} catch (IOException ex) {
				System.out.println("File could not be read!" + ex);
			}
		}
	}

	public final void clear() {
		this.verlauf.clear();
	}

	public final int getCount() {
		return this.verlauf.size();
	}

	public final double getMaxTemp() {
		double max_temp = -273.15;
		for (Temperature t : verlauf) {
			if (t.getTemperatureCelsius() > max_temp) {
				max_temp = t.getTemperatureCelsius();
			}
		}
		return max_temp;
	}

	public final double getMinTemp() {
		double min_temp = 1000;
		for (Temperature t : verlauf) {
			if (t.getTemperatureCelsius() < min_temp) {
				min_temp = t.getTemperatureCelsius();
			}
		}
		return min_temp;
	}

	public final double getAverageTemp() {
		Iterator<Temperature> iterator = verlauf.iterator();
		double sum = 0.0;
		while (iterator.hasNext()) {
			sum += iterator.next().getTemperatureCelsius();

		}
		return sum / verlauf.size();
	}

	public LocalDateTime getMaxTime() {
		double max_temp = -273.15;
		LocalDateTime max_timestamp = null;
		for (Temperature t : verlauf) {
			if (t.getTemperatureCelsius() > max_temp) {
				max_temp = t.getTemperatureCelsius();
				max_timestamp = t.getTimestamp();
			}
		}
		return max_timestamp;

	}

	public LocalDateTime getMinTime() {
		double min_temp = 1000;
		LocalDateTime min_timestamp = null;
		for (Temperature t : verlauf) {
			if (t.getTemperatureCelsius() < min_temp) {
				min_temp = t.getTemperatureCelsius();
				min_timestamp = t.getTimestamp();
			}
		}
		return min_timestamp;
	}

	/**
	 * Get all tempvalues from verlauf in an List.
	 */
	public List<Double> getTempValues() {
		List<Double> returnlist = new ArrayList<>();
		for (Temperature temp : verlauf) {
			returnlist.add(temp.getTemperatureCelsius());
		}

		return returnlist;
	}

	/**
	 * Override of toString method.
	 * 
	 * @return String which size of value
	 */
	@Override
	public final String toString() {
		return "ArrayList with " + this.verlauf.size() + " Temperature objects stored: " + this.getAverageTemp()
				+ "avg temp, " + this.getMaxTemp() + " max temp, " + this.getMinTemp() + " min temp";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (!(obj instanceof TemperatureVerlauf)) {
			return false;
		}

		final TemperatureVerlauf other = (TemperatureVerlauf) obj;
		return (this.getCount() == other.getCount());
	}

	@Override
	public final int hashCode() {
		return Objects.hashCode(this.getCount());
	}

	/**
	 * Override of method compareTo.
	 * 
	 * @return Integer value of compare
	 */
	@Override
	public final int compareTo(TemperatureVerlauf other) {
		return Integer.compare(this.getCount(), this.getCount());
	}

	/**
	 * firePropertyEvent method fires event when property changed
	 * 
	 */
	private void firePropertyChangeEvent(final TemperatureEvent pcEvent) {
		for (final TempPropertyChangeListener listener : this.changeListeners) {
			listener.propertyChange(pcEvent);
		}
	}

	/**
	 * addPropertyChangeListener adds Property to changeListeners Array.
	 */
	public void addPropertyChangeListener(final TempPropertyChangeListener listener) {
		this.changeListeners.add(listener);
	}

	/**
	 * removePropertyChangeListener removes Property from changeListeners Array
	 * 
	 * @param listener
	 */
	public void removePropertyChangeListener(final TempPropertyChangeListener listener) {
		this.changeListeners.remove(listener);
	}

}
