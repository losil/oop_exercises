/**
 * 
 */
package ch.hslu.oop.sw10;



import java.beans.PropertyChangeEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * PropertyChangeListener is a Interface for listening on events
 * @author silvan
 *
 */
public interface PropertyChangeListener {
	
	static final Logger LOG  = LogManager.getLogger(PropertyChangeListener.class);
	
	public abstract void propertyChange(PropertyChangeEvent pcEvent);
	
	public abstract void propertyChange(TemperatureEvent pcEvent);
	
}

