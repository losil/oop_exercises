package ch.hslu.oop.sw6;

public abstract class Element {
	
	private double temp;
	private double meltingPoint;
	private double  boilingPoint;
	
	protected Element(final double temp, final double meltingPoint, final double boilingPoint) {
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
	}
	
	public String getAggregateState( ) {
		if (this.temp <= this.meltingPoint ) {
			return "fluessig";
		}
		
		else if (this.temp < this.boilingPoint) {
			return "fest";
		}
		
		else {
			return "gasfoerming";
		}
	}
	
	@Override
	public String toString() {
		return "Aggregatszustand : " + this.getAggregateState();
	}
	
	
}
