//lex_auth_012908251670077440518
//do not modify the above line

package staticassignment3;


class Boking {

	   private String customerEmail;
	   private int seatsRequired;
	   private boolean isBooked;
	   private static int seatsAvailable;
	
	   static {
		// TODO Auto-generated method stub
          seatsAvailable=400;
	}
	   
	   
	   public Boking(String customerEmail, int seatsRequired) {
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;
		
		if (seatsAvailable>=seatsRequired)
		{
			seatsAvailable=seatsAvailable-seatsRequired;
			isBooked=true;
		}
		else {
			isBooked=false;
		}
	}




	public String getCustomerEmail() {
		return customerEmail;
	}




	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}




	public int getseatsRequired() {
		return seatsRequired;
	}




	public void setSetRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}




	public boolean isBooked() {
		return isBooked;
	}




	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}




	public static int getSeatsAvailable() {
		return seatsAvailable;
	}




	public static void setSeatsAvailable(int seatsAvailable) {
		Boking.seatsAvailable = seatsAvailable;
	}
	
	
	
	   
	   
}



public class Tester {
	
	 public static void main(String[] args) {
		 Boking booking1 = new Boking("jack@email.com", 100);
		 Boking booking2 = new Boking("jill@email.com", 350);

	        //Create more objects and add them to the bookings array for testing your code
	        
		 Boking[] bookings = { booking1, booking2 };
	              
	        for (Boking booking : bookings) {
	            if (booking.isBooked()) {
	                System.out.println(booking.getseatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
	            }
	            else {
	                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
	                System.out.println("Seats available: "+Boking.getSeatsAvailable());
	            }
	         }
	    }

}
