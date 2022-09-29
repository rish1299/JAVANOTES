package arrayassignment3;
//Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. 
//Include the year passed as parameter if it is a leap year. Implement the logic inside findLeapYears() method and
//return an int array containing all the leap years.

class  ThirdAs{    

	public static int[] findLeapYears(int year)
      {
		int n=0;
		int[] leapYears = new int[15];
		
		while (n<15) {
			if (year%4==0 && (year%100!=0 || year%400==0)) {
				leapYears[n]=year;
				n++;
			}
			year++;
		}
		return leapYears;
	
		

}

}

public class Que_3 {

	public static void main(String[] args) {
		int year = 2000;
		   int[] leapYears;
		   ThirdAs ts = new ThirdAs();
		   leapYears= ts.findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) 
		      {
		       System.out.println(leapYears[index]);
		      }
	}



}




