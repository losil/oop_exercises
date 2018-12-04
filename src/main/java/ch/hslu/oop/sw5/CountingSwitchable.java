/**
 * 
 */
package ch.hslu.oop.sw5;

/**
 * @author silvan
 *
 */
public interface CountingSwitchable extends Switchable {
    
    /**
     * Method which returns Switch count.
     * 
     * @return Returns the amount of the switch usings
     */
    long getSwitchCount();

}
