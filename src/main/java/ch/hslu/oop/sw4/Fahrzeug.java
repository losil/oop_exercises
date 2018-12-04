package ch.hslu.oop.sw4;

/**
 * Create an object Fahrzeug with objects Motor and Licht as attributes.
 *
 * @author (Silvan Loser)
 * @version (v1.0)
 */
public class Fahrzeug implements Switchable
{
    // instance variables - replace the example below with your own
    private Motor motor1;
    private Licht licht1;

    /**
     * Constructor for objects of class Fahrzeug.
     */
    public Fahrzeug()
    {
        // initialise instance variables
        motor1 = new Motor();
        licht1 = new Licht();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn()
    {
        motor1.switchOn();
        licht1.switchOn();
    }
    
    public void switchOff()
    {
        motor1.switchOff();
        licht1.switchOff();
    }
    
    public boolean isSwitchedOn()
    {
        if ( motor1.isSwitchedOn() == true && licht1.isSwitchedOn() == true )
        {
            return true;
        }
        else {
            return false;
        }
    }
        
    public boolean isSwitchedOff() 
    {
        if ( motor1.isSwitchedOn() == false && licht1.isSwitchedOn() == false )
        {
            return true;
        }
        else {
            return false;
        }
    }
}
