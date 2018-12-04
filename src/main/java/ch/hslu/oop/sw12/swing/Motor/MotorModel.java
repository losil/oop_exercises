/**
 * 
 */
package ch.hslu.oop.sw12.swing.Motor;


/**
 * @author silvan
 *
 */
public class MotorModel {
	
	private MotorState state = MotorState.OFF;
	private int rpms = 0;

	/**
	 * @return the state
	 */
	public MotorState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(MotorState state) {
		this.state = state;
	}

	/**
	 * @return the rpms
	 */
	public int getRpms() {
		return rpms;
	}

	/**
	 * @param rpms the rpms to set
	 */
	public void setRpms(int rpms) {
		this.rpms = rpms;
	}

	/**
	 *
	 */
	public void changeRpms(int rpms) { this.rpms += rpms;}



}
