
package ch.hslu.oop.sw10;

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
	private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
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
			if (t.getTemperatureCelsius() > max_temp ) {
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
	/**
	 * Override of toString method.
	 * @return String which size of value
	 */
	@Override
	public final String toString() {
		return "ArrayList with " + this.verlauf.size() + " Temperature objects stored: " + this.getAverageTemp() + "avg temp, " + 
	            this.getMaxTemp() + " max temp, " + this.getMinTemp() + " min temp";
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
    		for(final PropertyChangeListener listener : this.changeListeners) {
    			listener.propertyChange(pcEvent);
    		}
    }	
    		
	/**
	 * addPropertyChangeListener adds Property to changeListeners Array.
	 */
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		this.changeListeners.add(listener);
	}
	
	/**
	 * removePropertyChangeListener removes Property from changeListeners Array
	 * @param listener
	 */
	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		this.changeListeners.remove(listener);
	}

}
