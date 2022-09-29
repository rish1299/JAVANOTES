package wracls;



class Item {
	private int ItemNo;
	private String ItemName;
	private String category;
	

	public Item(int ItemNo, String ItemName, String category) {
		this.ItemNo = ItemNo;
		this.ItemName = ItemName;
		this.category = category;
	}

	public int getItemNo() {
		return ItemNo;
	}

	public void setItemNo(int ItemNo) {
		this.ItemNo = ItemNo;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public void displayItemInfo() {
		
	System.out.println("Item Number is :" +this.ItemNo );
	System.out.println("Item Name is :"  +this.ItemName);
	System.out.println("Item Category is :"  +this.category);
	
	}
	


public boolean equals(Object obj)  //object of object class
{
	Item item = (Item)obj;   // i is an invoking object which is converted into item class object     
	if(this.ItemName.equals(item.ItemName))  //implementing or overriding the equalsto method
		return true;
	else
		return false;

}

}

public class cls1 {

	public static void main(String[] args) {
		
            Item i1 = new Item(1,"Orange", "Fruit");
            Item i2 = new Item(2,"Apple", "Fruit");
            Item i3 = new Item(3,"Orange", "Fruit");
            Item i4 = new Item(3,"Orange", "Fruit");
            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            
            System.out.println(i1.equals(i2));
            System.out.println(i1.equals(i3));
            System.out.println(i2.equals(i4));
	}

}
