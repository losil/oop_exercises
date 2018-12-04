package ch.hslu.oop.sw5;

public abstract class Element {
	
	private double meltingPoint;
	private double  boilingPoint;
	
	protected Element(final double meltingPoint, final double boilingPoint) {
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
	}
	
	public String getAggregateState(final double temperature ) {
		if (temperature <= this.meltingPoint ) {
			return "fluessig";
		}
		
		else if (temperature < this.boilingPoint) {
			return "fest";
		}
		
		else {
			return "gasfoerming";
		}
	}
	
	
}
