package methodsassignment4;

class Calculatorr {

    public int num, sum=0;
	// Implement your code here
	public int sumOfDigits()
	{
	  while (num>0) {
		int temp=num%10;
		
		sum=sum+temp;
		
		num=num/10;
		
	}
	  System.out.println("the sum of digits of the given number is " +sum);
	  return 0;
	}
    
}

public class Asgn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorr cal = new Calculatorr();
          cal.num=6547;
         cal.sumOfDigits();
	}

}
