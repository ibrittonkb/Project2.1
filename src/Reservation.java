import java.util.Scanner;

public class Reservation {

	private String creditCardNum;
	private String rentalPeriodType;
	private String rentalType;
	private String guestLastName;
	Reservation res = null;
	private String vehicleType;
	private static Vehicle[] vehicle = new VehicleType[5];
	private static String custType;
	private static String custName;
	private static String rentType;

	public Reservation(String guestLastName, String vehicleType,
			String rentalType) {

		this.vehicleType = custType;
		this.guestLastName = custName;
		this.rentalType = rentType;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public String getGuestLastName() {
		return guestLastName;
	}
	public String getCustType(){
		return custType;
	}

	public void setGuestLastName(String guestLastName) {
		this.guestLastName = guestLastName;
	}

	public String getRentalType() {
		return rentalType;

	}

	public static void reservation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select vehicle type: (Car, SUV, Truck, Deluxe)");
		String type = input.next();
		custType= type;
		System.out.println("Please enter your last name");
		custName = input.next();
		System.out.println("Enter duration of rental (Day, Week, Month)");
		 rentType = input.next();
		vehicle[0] = new VehicleType("Nissan 350z", "25", 2);
		vehicle[1] = new VehicleType("Lamborghini", "10", 2);
		vehicle[2] = new VehicleType("Ford F150", "12", 4);
		vehicle[4] = new VehicleType("Audi Q7", "24", 7);
		if (type.equalsIgnoreCase("car"))
			System.out.print(vehicle[0] +" " +  custType +" " +custName + " "+ rentType);
		else if (type.equalsIgnoreCase("suv"))
			System.out.print(vehicle[4]);
		else if (type.equalsIgnoreCase("truck"))
			System.out.print(vehicle[2]);
		else if (type.equalsIgnoreCase("deluxe"))
			System.out.print(vehicle[1]);
	}
}
