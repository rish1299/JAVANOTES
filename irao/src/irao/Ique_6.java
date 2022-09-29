package irao;

//Method Description

//findAverage()
//
//Calculate the average of three numbers
//
//Return the average rounded off to two decimal digits

class Calculator{
public double findAverage (int n1, int n2, int n3)
{
	double avg = (double)(n1+n2+n3)/3;
    double roundoff = (Math.round(avg*100.0)/100.0);
    
    return roundoff;
}
}



public class Ique_6 {

	public static void main(String[] args) {
		        Calculator calculator = new Calculator();
		        System.out.println(calculator.findAverage(12, 8, 15));

	}

}
