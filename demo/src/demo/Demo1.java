package demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		
	    String strname = scan.next();
	    
	    System.out.println("Enter the Marks ");
	   
	    int m1 = scan.nextInt();
	    int m2 = scan.nextInt();
		int m3 = scan.nextInt();
	    
	    int Avg = (m1+m2+m3) / 3;
	    
		System.out.println(strname);
		System.out.print(Avg);
		
	}
}
