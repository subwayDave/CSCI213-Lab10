public class Car extends Vehicle {

	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers) {
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	 public int getPassengers() {
	 	 return this.passengers;
	}
	
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.doors,
			super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		Car otherCar = (Car) other;
		if(this.doors == otherCar.getDoors() && this.passengers == otherCar.getPassengers()) {
			super.equals(other);
		}
		return false;
	}
	
	public Car copy() {
		Car theCopy = new Car(super.getMake(), super.getModel(), super.getPlate(), this.doors, this.passengers);
		return theCopy;
	}
}
	 
	
	