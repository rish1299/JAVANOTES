package wracls;

class Itemm {
	private int ItemNo;
	private String ItemName;
	private String category;
	

	public Itemm(int ItemNo, String ItemName, String category) {
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
	


public   String toString()
{
	return ItemName;

}

}

public class cls2 {

	public static void main(String[] args) {
		
            Itemm i1 = new Itemm(1,"Orange", "Fruit");
            Itemm i2 = new Itemm(2,"Apple", "Fruit");
            Itemm i3 = new Itemm(3,"Orange", "Fruit");
            
            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            
            System.out.println(i1.equals(i2));
	}

}
