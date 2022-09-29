package aggregationassignment3;

class Customer
{
	
   private String customerId;
   private String customerName;
   private long customerNumber;
   
   
   public Customer() {
	
}



public Customer(String customerId, String customerName, long customerNumber) {
	
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerNumber = customerNumber;
	
}



public Customer(String customerName, long customerNumber) {
	
	this.customerName = customerName;
	this.customerNumber = customerNumber;
	
}



public String getCustomerId() {
	return customerId;
}



public void setCustomerId(String customerId) {
	this.customerId = customerId;
}



public String getCustomerName() {
	return customerName;
}



public void setCustomerName(String customerName) {
	this.customerName = customerName;
}



public long getCustomerNumber() {
	return customerNumber;
}



public void setCustomerNumber(long customerNumber) {
	this.customerNumber = customerNumber;
}












public void displayCustomerDetails() {
	
	System.out.println("Customer id : " +this.customerId);
	System.out.println("Customer Name : " +this.customerName);
	System.out.println("Customer Contact Number : " +this.customerNumber);
	
}




public double paybill() 
{
	
	return 0.0;
}
   
}

class order{
	private static int orderIdCounter;
	private int orderid;
	private Customer customer;
	private double totalPrice ;
	private String status;
	
	
	
	
}









public class Assgn1 {

	public static void main(String[] args) {
		System.out.println("heloo");

	}

}
