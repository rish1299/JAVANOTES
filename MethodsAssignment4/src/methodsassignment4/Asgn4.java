package methodsassignment4;
class Rectangle {
    //Implement your code here  
	public float length;
	public float width;
	
	
	public double calculateArea() 
	{
		double ara;
		
		ara=length*width;
	
		return ara;
	}
	
	public double calculatePerimeter()
	{
        double peri;
		
        peri=2*(length+width);
	
		return peri;
	}

	
    
}







public class Asgn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		//Assign values to the member variables of Rectangle class
		rect.length=6f;
		rect.width=3f;
		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		rect.calculateArea();
		rect.calculatePerimeter();
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is " +rect.calculateArea());
		System.out.println("Perimeter of the rectangle is " +rect.calculatePerimeter());
	}

}
