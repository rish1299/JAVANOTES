package mthodoverriding;


abstract class Payment
{
	

	private int customerId;
	protected String paymentId;
	protected double serviceTaxPercentage;
	
	public Payment(int customerId) {	
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	
    abstract public double payBill(double amount);

}




class DebitCardPayment extends Payment {

	private static int counter;
	private double discountPercentage;

	static {
		counter=1000;
		counter++;
	}
	public DebitCardPayment(int customerId) {
		super(customerId);
		this.setPaymentId("D" +counter);
	
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double payBill(double amount)
	{
		double tpay=0;
		
		if (amount<=500) {
			
		
			this.setServiceTaxPercentage(2.5);
			discountPercentage =1;
			tpay = amount * (1+ ( this.getServiceTaxPercentage()/100 ) - ( discountPercentage/100) );
			
			
		} 
		else if (amount>500 && amount<=1000) {
			
			this.setServiceTaxPercentage(4);
			discountPercentage =2;
			tpay = amount * (1+ ( this.getServiceTaxPercentage()/100 ) - ( discountPercentage/100) );
		}
		else if (amount>1000) {
			
			this.setServiceTaxPercentage(5);
			discountPercentage =3;
			tpay = amount * (1+ ( this.getServiceTaxPercentage()/100 ) - ( discountPercentage/100) );
		}
		
		return tpay;
		
		
	}
	
	
}











class CreditCardPayment extends Payment{
	private static int counter;
	static {
		counter=1000;
		counter++;
	}
	
	public CreditCardPayment (int customerId) {
		super(customerId);
		this.setPaymentId("C" +counter);
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	public double payBill(double amount)
	{
		double tpay=0;
		
		if (amount<=500) {
			
			this.setServiceTaxPercentage(3);
			tpay = amount * (1+ (this.getServiceTaxPercentage()/100)); 
			
		} 
		else if (amount>500 && amount<=1000) {
		
			this.setServiceTaxPercentage(5);
			tpay = amount * (1+ (this.getServiceTaxPercentage()/100)); 
			
		}
		else if (amount>1000) {
		
			this.setServiceTaxPercentage(6);
			tpay = amount * (1+ (this.getServiceTaxPercentage()/100)); 
			
		}
		
		return tpay;
		
		
	}
	
	
	
	
}








public class AbstactAssgnment1 {

	public static void main(String[] args) {
		 DebitCardPayment debitCardPayment = new DebitCardPayment(101);
	        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
			System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
			System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
			System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
			System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
			System.out.println("Total bill amount: " + billAmount);
			
			CreditCardPayment creditCardPayment = new CreditCardPayment(102);
	        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
			System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
			System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
			System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
			System.out.println("Total bill amount: " + billAmount);

	}

}
