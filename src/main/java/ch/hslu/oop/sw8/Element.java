package ch.hslu.oop.sw8;

/**
 * Class Element which defines basics of an element.
 * @author silvan
 *
 */
public abstract class Element {
	
	private double temp;
	private double meltingPoint;
	private double  boilingPoint;
	
		
	protected Element(final double temp, final double meltingPoint, final double boilingPoint) {
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
		this.temp = temp;
	}
	
	
	public double getTemp( ) {
		return this.temp;
	}
	
	
	public String getAggregateState( ) {
		if (this.temp <= this.meltingPoint ) {
			return Aggregatszustand.SOLID.getDescription();
		}
		
		else if (this.temp < this.boilingPoint) {
			return Aggregatszustand.LIQUID.getDescription();
		}
		
		else {
			return Aggregatszustand.GAS.getDescription();
		}
	}
	
	@Override
	public String toString() {
		return "Aggregatszustand : " + this.getAggregateState();
	}
	
	
}
