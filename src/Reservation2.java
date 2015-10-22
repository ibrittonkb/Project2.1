import java.util.HashMap;
import java.util.Map;

public class Reservation2 extends HashMap {

	private String guestLastName;
	private Reservation reservation;
	private HashMap<String,Reservation> reservationIndex;
	
	public Reservation2() {
		this.guestLastName = guestLastName;
        this.reservation = reservation;
    }
	
	public void addReservationToIndex(Reservation reservation, Reservation2 reservationIndex) {
		guestLastName = reservation.getGuestLastName();
		reservationIndex.put(guestLastName, reservation);
	}
	
	public Reservation getReservationByName(String guestLastName, Reservation2 reservationIndex){
			Reservation reservation = (Reservation) reservationIndex.get(guestLastName);
			return reservation;
	}
	
	
	

}