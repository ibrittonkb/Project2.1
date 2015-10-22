public abstract class Vehicle {

	private String description;
	private String mpg;
	private int num;

	

	public Vehicle(String description, String mpg, int num) {

		this.description = description;
		this.mpg = mpg;
		this.num = num;

	}

	public String getDescription() {
		return description;
	}

	public String getMPG() {
		return mpg;
	}

	public int getNumber() {
		return num;
	}

}

	