package swiftFood.java;

class Customer
{
	
   private String customerId;
   private String customerName;
   private long customerNumber;
   private Address address;

   
   
   public Customer() {
	
}



public Customer(String customerId, String customerName, long customerNumber, Address address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerNumber = customerNumber;
	this.address = address;
}



public Customer(String customerName, long customerNumber, Address address) {
	super();
	this.customerName = customerName;
	this.customerNumber = customerNumber;
	this.address = address;
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



public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	this.address = address;
}




public void displayCustomerDetails() {}




public double paybill() 
{
	
	return 0.0;
}



   
   
   
     
}

class Address
{
	
	   private String doorNo;
	   private String street;
	   private String city;
	   private int zipCode;
	
	   
	   
	   
	   
	   
	   public Address(String doorNo, String street, String city, int zipCode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}






	public String getDoorNo() {
		return doorNo;
	}






	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}






	public String getStreet() {
		return street;
	}






	public void setStreet(String street) {
		this.street = street;
	}






	public String getCity() {
		return city;
	}






	public void setCity(String city) {
		this.city = city;
	}






	public int getZipCode() {
		return zipCode;
	}






	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}






}









public class Cls4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
