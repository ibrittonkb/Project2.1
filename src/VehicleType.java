public class VehicleType extends Vehicle {

	public VehicleType(String description, String mpg, int num) {

		super(description, mpg, num);

	}

	public String toString() {
		return "Description: " + getDescription() + " MPG: " + getMPG()
				+ " Num Seats :" + getNumber();

	}
}