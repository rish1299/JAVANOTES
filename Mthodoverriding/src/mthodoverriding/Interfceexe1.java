package mthodoverriding;

interface Tax {
	
	public double calculateTax(double price);
	
}









class PurchaseDetails implements Tax
{
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	
	public PurchaseDetails(String purchaseId, String paymentType) {
	
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}



	public String getPurchaseId() {
		return purchaseId;
	}



	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}



	public String getPaymentType() {
		return paymentType;
	}



	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}



	public double getTaxPercentage() {
		return taxPercentage;
	}



	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}



	public double calculateTax(double price)
	{
		
		double res=0;
		
		if (this.paymentType.equals("Debit Card")) {
            res = price +price * (0.02);			
			this.setTaxPercentage(2);
		}
		else if (this.paymentType.equals("Credit Card")) {
			res =price + price * (0.03);
			this.setTaxPercentage(3);
		}
		else {
			res = price +price * (0.04);
			this.setTaxPercentage(4);
		}
		
		
		
		
		return res;
	}
}



class Seller implements Tax
{
	private String location;
	private double taxPercentage;
	
	
	
	public Seller(String location) {
		
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	
	
	public double calculateTax(double price)
	{
		
		double res=0;
		
		if (this.location.equals("Middle east")) {
			res = price * (0.15);			
			this.setTaxPercentage(15);
		}
		else if (this.location.equals("Europe")) {
			res = price * (0.25);			
			this.setTaxPercentage(25);
		}
        else if (this.location.equals("Canada")) {
        	res = price * (0.22);			
			this.setTaxPercentage(22);
		}
        else if (this.location.equals("Japan")) {
        	res = price * (0.12);			
			this.setTaxPercentage(12);
}
		
		
		
		
		
		return res ;
	}
	
	
	
	
	
	
	
}








public class Interfceexe1 {

	public static void main(String[] args) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round( seller.calculateTax(100) * 100 ) / 100.0 );
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		

	}

}
