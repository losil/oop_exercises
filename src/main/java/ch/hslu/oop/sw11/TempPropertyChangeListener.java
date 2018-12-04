/**
 * 
 */
package ch.hslu.oop.sw11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * TempPropertyChangeListener listens on events from Temperatures.
 * @author silvan
 *
 */
public interface TempPropertyChangeListener {

	static final Logger LOG  = LogManager.getLogger(TempPropertyChangeListener.class);
	
	/**
	 * Defines propertyChange method for firing change events.
	 * @param pcEvent
	 */
	public abstract void propertyChange(TemperatureEvent pcEvent);

}

