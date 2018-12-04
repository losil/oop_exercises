/**
 * 
 */
package ch.hslu.oop.sw12.swing.Motor;
/**
 * Interface Switchable which describes a simple Switch.
 *
 * @author (Silvan Loser)
 * @version (10.10.2017)
 */
public interface Switchable { 
    
    /**
     * Method switchOn which sets state of Switch to on.
     *
     */
    void switchOn(MotorModel motor);
    
    
    /**
     * Method switchOff which sets state of Switch to off.
     *
     */
    void switchOff(MotorModel motor);
    
    
    /**
     * Method isSwitchedOn which returns the boolean True.
     *
     * @return Returns true if Switch is switched on
     */
    boolean isSwitchedOn(MotorModel motor);
    
    
    /**
     * Method isSwitchedOff which returns the boolean False.
     *
     * @return Returns true if Switch is switched off
     */
	    boolean isSwitchedOff(MotorModel motor); 
	}


