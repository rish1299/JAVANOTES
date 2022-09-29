package mthodoverriding;
//method overloading
/* class Point{
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate) {
	
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance() 
	{
		
	
	  double distance = Math.sqrt( (getxCoordinate()-0)*(getxCoordinate()-0) + 
				      (getyCoordinate()-0)*(getyCoordinate()-0) );
	  
	    return  Math.round (distance*100)/100.0; 
	    
	}		
				
				
	
	
	
	public double calculateDistance(Point point) 
	{
		
	
		double distance = Math.sqrt( (point.xCoordinate-xCoordinate)*(point.xCoordinate-xCoordinate) +
				(point.yCoordinate-yCoordinate)*(point.yCoordinate-yCoordinate));
	    
	    return Math.round (distance*100)/100.0; 
	}
	
}


*/


public class Mthodoverloadingexercise1 {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));


	}

}
