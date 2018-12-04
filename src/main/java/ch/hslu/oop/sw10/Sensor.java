/**
 * 
 */
package ch.hslu.oop.sw10;

import java.beans.PropertyChangeEvent;

/**
 * @author silvan
 *
 */
public class Sensor implements PropertyChangeListener {
	private final TemperatureVerlauf verlauf;
	public Sensor() {
		verlauf = new TemperatureVerlauf();
		verlauf.addPropertyChangeListener(this);
	}
	
	
	public void propertyChange(PropertyChangeEvent event) {
    		LOG.info("New Max Reached" + event.toString());
    }
	
	/**
	 * Add Temperature object to ArrayList
	 * @param t
	 */
	public void add(Temperature t) {
		verlauf.add(t);
	}


	/* (non-Javadoc)
	 * @see ch.hslu.oop.sw10.PropertyChangeListener#propertyChange(ch.hslu.oop.sw10.TemperatureEvent)
	 */
	@Override
	public void propertyChange(TemperatureEvent pcEvent) {
		// TODO Auto-generated method stub
		
	}

}
