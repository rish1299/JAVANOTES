package methodsassignment4;

class Order {
    public   int orderId =101;
    public   String orderedFood ="spinach";
    public   Double totalPrice;
    public   String status="ordered";
     
     public Double calculateTotalPrice(int unitPrice) 
     {
    	 totalPrice =(double) unitPrice + (1 - 5/100 );
    	  return totalPrice;
     }
     
}


public class Asgn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Order or = new Order();
        System.out.println("Order id is " +or.orderId);
        System.out.println("Ordered Food is " +or.orderedFood );
        System.out.println("Order Status is " +or.status );
        System.out.println("Total price is " +or.calculateTotalPrice(34));
		
	}

}
