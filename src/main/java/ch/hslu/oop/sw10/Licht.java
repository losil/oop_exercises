
package ch.hslu.oop.sw10;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Licht describes a light object.
 * @author silvan
 *
 */
public class Licht implements Switchable, Comparable<Licht> {

	private LichtState state;
	private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
	
    /**
     * Constructor for objects of class Motor.
     */
    public Licht()
    {
        state = LichtState.OFF;
    }

    /**
     * Switch light on.
     */
    @Override
    public void switchOn() {
        this.state = LichtState.ON;
        final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", LichtState.OFF, LichtState.ON);
        this.firePropertyChangeEvent(pcEvent);
     
    }
    
    /**
     * Switch light off.
     */
    public void switchOff() {
        this.state = LichtState.OFF;
        final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", LichtState.ON, LichtState.OFF);
        this.firePropertyChangeEvent(pcEvent);
    
    }
    
    /**
     * Check if light is running.
     * @return true if light is on
     */
    public boolean isSwitchedOn() {
        if (this.state == LichtState.ON ) {
            return true;
        }
        
        else { 
            return false;
        }
    }
    
    /**
     * Check if light is off.
     * @return true if light is off
     */
    public boolean isSwitchedOff() {
        if (this.state == LichtState.OFF) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * toString method describes a light.
     * @return Display light as string
     */
    @Override
    public String toString() {
    	if (this.isSwitchedOn()) {
    		return "Licht is switched on.";
    	}
    	
    	else {
    		return "Licht is switched off.";
    	}
    }
    
    /**
     * equals method for a Licht-object
     * @return true if objects equals
     */
    @Override
	public boolean equals(final Object obj) {
		if (obj == this ) {
			return true;
		}
		
		if (!(obj instanceof Licht)) {
			return false;
		}
		
		final Licht other = (Licht) obj;
		return (other.state == this.state);
    }
    
    /**
     * Override of hashCode
     * @returns hashCode of object
     */
    @Override
    public int hashCode() {
    		return Objects.hashCode(this.state);
    }
    
    /**
     * Override of method compareTO
     * @return value of compare result
     */
    @Override
    public int compareTo(Licht other) {
    	if (this.state == other.state) {
    		return 0;
    	}
    	
    	if (this.state == LichtState.OFF && other.state == LichtState.ON) {
    		return -1;
    	}
    	
    	else {
    		return 1;
    	}
    }
    	
    
    /**
     * firePropertyEvent method fires event when property changed
     * 
     */
    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
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
