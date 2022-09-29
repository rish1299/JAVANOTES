package swiftFood.java;

/*class Food {
	public String foodName;
	public String cuisine;
	public String foodType;
	public int quantityAvailable;
	public Double unitPrice;
	 
	public void displayInfo() {
		System.out.println("food name " +foodName);
		System.out.println("type of cuisine " +cuisine);
		System.out.println("type of food " +foodType);
		System.out.println("quantity of food available " +quantityAvailable);
		System.out.println("unit price of food " +unitPrice);
		
	}
	
}

public class cls1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Food fd = new Food();
		
		fd.foodName = "PIZZA";
		fd.cuisine = "italian";
		fd.foodType = "veg";
		fd.quantityAvailable = 5;
		fd.unitPrice = 10.00;
		fd.displayInfo();
	}

}

*/



/*
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

public class cls1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order or = new Order();
				
		System.out.println("orderId " +or.orderId);
		System.out.println("orderedFood " +or.orderedFood );
		System.out.println("status " +or.status);
	    System.out.println("totalPrice " + or.calculateTotalPrice(34));
	}

}

*/


class Food {
    private String foodName;
    private String cuisine;
    private String foodType;
    private int quantityAvailable;
    private Double unitPrice;
    

	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public String getCuisine() {
		return cuisine;
	}




	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}




	public String getFoodType() {
		return foodType;
	}




	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}




	public int getQuantityAvailable() {
		return quantityAvailable;
	}




	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}




	public Double getUnitPrice() {
		return unitPrice;
	}




	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}




	public void displayInfo() {
		System.out.println("food name " +foodName);
		System.out.println("type of cuisine " +cuisine);
		System.out.println("type of food " +foodType);
		System.out.println("quantity of food available " +quantityAvailable);
		System.out.println("unit price of food " +unitPrice);
		
	}
	
}



class Order {
	    private  int orderId;
	    private  String orderedFood;
	    private  Double totalPrice;
	    private  String status;
    
    
     
     
    	
    	
    	
    	

		public int getOrderId() {
			return orderId;
		}




		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}




		public String getOrderedFood() {
			return orderedFood;
		}




		public void setOrderedFood(String orderedFood) {
			this.orderedFood = orderedFood;
		}




		public Double getTotalPrice() {
			return totalPrice;
		}




		public void setTotalPrice(Double totalPrice) {
			this.totalPrice = totalPrice;
		}




		public String getStatus() {
			return status;
		}




		public void setStatus(String status) {
			this.status = status;
		}




		public Double calculateTotalPrice(int unitPrice) 
		{
	 totalPrice =(double) unitPrice + (1 - 5/100 );
	  return totalPrice;
		}
		

}




public class cls1 {

	public static void main(String[] args) {
		
		Order or = new Order();
		or.setOrderId(101);
		or.setOrderedFood("Spinach");
		or.setStatus("Ordered");
	
		System.out.println("orderId " +or.getOrderId());
		System.out.println("orderedFood " +or.getOrderedFood() );
		System.out.println("status " +or.getStatus());
	    System.out.println("totalPrice " + or.calculateTotalPrice(34));
	    
	    System.out.println("************************************************");
	    
	    Food fd = new Food();
	    fd.setFoodName("PIZZA");;
		fd.setCuisine("italian");;
		fd.setFoodType("veg");;
		fd.setQuantityAvailable(5);;
		fd.setUnitPrice(10.00); 
		
		System.out.println("Food name " +fd.getFoodName());
		System.out.println("Cuisine is " +fd.getCuisine());
		System.out.println("FoodType is " +fd.getFoodType());
		System.out.println("QuantityAvailable is " +fd.getQuantityAvailable());
		System.out.println("UnitPrice is " +fd.getUnitPrice());
		}
	}









