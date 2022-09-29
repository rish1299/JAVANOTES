package irao;
//static exercise 1

class Bill{
    //Implement your code here
	private static int counter;
	private String billId;
	private String paymentMode;
	
	static {
		counter =9001;
	}
	
	public Bill(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getBillId() {
		this.billId="B"+" "+counter++;
		return billId;
	
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	
	
	
	
	
	
		
	
    
}
public class Ique10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Bill bill1 = new Bill("DebitCard");
	        Bill bill2 = new Bill("PayPal");
	        
	        //Create more objects and add them to the bills array for testing your code
	              
	        Bill[] bills = { bill1, bill2 };
	              
	        for (Bill bill : bills) {
	            System.out.println("Bill Details");
	            System.out.println("Bill Id: " + bill.getBillId());
	            System.out.println("Payment method: " + bill.getPaymentMode());
	            System.out.println();
	       }
	}

}
