//lex_auth_012908251670077440518
//do not modify the above line

package staticassignment3;


 class Booking {

	   private String customerEmail;
	   private int setRequired;
	   private boolean isBooked;
	   private int seatsAvailable;
	
	   
	   
	   
	   public Booking(String customerEmail, int setRequired) {
		super();
		this.customerEmail = customerEmail;
		this.setRequired = setRequired;
	}




	public String getCustomerEmail() {
		return customerEmail;
	}




	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}




	public int getSetRequired() {
		return setRequired;
	}




	public void setSetRequired(int setRequired) {
		this.setRequired = setRequired;
	}




	public boolean isBooked() {
		return isBooked;
	}




	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}




	public int getSeatsAvailable() {
		return seatsAvailable;
	}




	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	
	
	   
	   
}


