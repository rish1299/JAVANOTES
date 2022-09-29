package irao;

import java.util.Scanner;

public class CotrolStructureAssignment {

	public static void main(String[] args) {
	   /*  int num1 =3 ;
	     int num2 =4 ;
	     int num3 =1 ;
	     
	     if (num1 > num2) {
	    	 System.out.println("num1 is greatest");
			
		} 
	     else if(num2>num3) {
	    	 System.out.println("num2 is greatest");

		}
	     else {
	    	 System.out.println("num3 is greatest");
	     }

	     */
		
		//assginment_1_Selection Control Structure
		//Implement a program to display the sum of two given numbers
		//if the numbers are same. If the numbers are not same, display the double of the sum.
		
        /*    Scanner sc = new Scanner(System.in);
        	System.out.println("Enter num1");
            int num1 = sc.nextInt();
        	System.out.println("Enter num2");
            int num2 = sc.nextInt();
            
            if (num1==num2) {
				System.out.println(num1+num2);
			} 
            else {
            	System.out.println(2 * (num1+num2));	

			}
            */
		
		//assignment_2_Selection Control Structure
		 
	/*	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a");
    	int a = sc.nextInt();
    	System.out.println("Enter b");
    	int b = sc.nextInt();
    	System.out.println("Enter c");
    	int c = sc.nextInt();
    	  
    	int discriminant = ((b)*(b) - 4*(a)*(c));
    	float x1 = ((-(b) + (discriminant) ) / (2.0f * (a)) );
    	float x2 = ((-(b) - (discriminant) ) / (2.0f* (a)) );
    	
    	if (discriminant==0) {
    		
    		System.out.println( "The roots are equal " + "/t"  +x1  +x2);
    		
		} else if (discriminant>0) {
			System.out.println("The roots are unequal " + "/t"  +x1   +x2);

		}
		else {
			System.out.println("Tere are no real roots" );
		}
           */
		
		
		//assignment_3_Selection Control Structure
		
//	Implement a program to calculate the product of three positive integer values. 
//		However, if one of the integers is 7, consider only the values to the right of 7 for calculation. 
//		If 7 is the last integer, then display -1.
//	Note: Only one of the three values can be 7
		
	/*	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter num1 ");
    	int num1 = sc.nextInt();
    	System.out.println("Enter num2 ");
    	int num2 = sc.nextInt();
    	System.out.println("Enter num3 ");
    	int num3 = sc.nextInt();
		
    	if (num1!=7 && num2!=7 && num3!=7) {
    		System.out.println(num1*num2*num3);
			
		} else if (num1==7) {
			System.out.println(num2*num3);

		}
		else if (num2==7) {
			System.out.println(num3);

		}
		else if (num3==7) {
			System.out.println("-1");

		}
    	*/
		
		
		//assignment_4_Selection Control Structure
	/*	
		char food_Type = 'V' ;
		System.out.println(food_Type);
		int total_price,quantity_Ordered =1, distance=7, deliveryCharge=0;
		int vegetarian_combo = 12;
		int non_vegetarian_combo = 15;		
	    
	    if (distance >= 0.0 && distance <= 3.0) 
		 {
			deliveryCharge = 0;
		 }
		else if (distance>=3 && distance<=6) 
		 {
	        deliveryCharge = 1*(distance-3);		
		 }
	    else if (distance>6)
	    {
	    	deliveryCharge = 2*(distance-6)+3;
	    }
        else 
	     {
		System.out.println("-1");
	     }
	
		 
		 total_price = (12*quantity_Ordered) + deliveryCharge;
		 System.out.println(total_price);
	
	*/
	
		//Assignment_5_Selection Control Structure
		//bank_problem
		
	/*	
		Scanner sc = new Scanner(System.in); 
		
	
		
		System.out.println("Enter Account Number ");
		int accountNumber = sc.nextInt();
		if (accountNumber>1000 && accountNumber<1999)
		{continue;}
		
		
		System.out.println("Enter Salary  ");
		int salary = sc.nextInt();
		
		System.out.println("Enter Account Balance ");
		int accountBalance = sc.nextInt();
		
		System.out.println("Enter loan type  Car/House/Business");
		String loanType = sc.next();
		
		System.out.println("Enter loan Amount Expected ");
		int loanAmountExpected = sc.nextInt();
		
       System.out.println("Enter Number of EmisExpected ");		
       int emisExpected = sc.nextInt();
       
   	   System.out.println("Enter type of loan required Car / House /Business ");
       String st = sc.next();
       
       switch (st) {
	case "Car":
		if (accountBalance > 1000 && salary >=25000  && loanAmountExpected <= 5000000 && emisExpected <= 36)
        {
    	       System.out.println("Eligible loan amount 5000000 ");
        	   System.out.println("Eligile emis 36");
        }
		
		break;

	case "House":	
		if (accountBalance > 1000 && salary >=000  && loanAmountExpected <= 6000000 && emisExpected <= 60)
        {
    	       System.out.println("Eligible loan amount 5000000 ");
        	   System.out.println("Eligile emis 36");
        }
		
		break;
		
    case "business":
    	if (accountBalance > 1000 && salary >=75000  && loanAmountExpected <= 7500000 && emisExpected <=84 )
        {
    	       System.out.println("Eligible loan amount 5000000 ");
        	   System.out.println("Eligile emis 36");
        }
		
		break;
		
		
	default:
		 System.out.println("not eligilbe for loan");
		break;
	}
       
      
       
	   
	}
		*/
		
		//Assignment_6_Selection Control Structure
		
		//21 =  5* x  4 + 1* y 1
		
	/*	
		int $1noteAvailable = 2; //1$
		int $5noteAvialable = 4; //5$
		int amountZ = 21;
        int $1NoteNeeded=0,$5noteNeeded=0;  // x = number of 1$  and y = number of 5$ note
        
        
         int totalAmount = $1noteAvailable * 1 + $5noteAvialable * 5;
         
         if (amountZ>totalAmount) {
        	 System.out.println("-1");
			
		} else {
			$5noteNeeded = amountZ/5;
			System.out.println("Number of 5$ note " +$5noteNeeded);
			$1NoteNeeded = amountZ%5;
			System.out.println("Number of 1$ note " +$1NoteNeeded);

		}
    
        */
	
		
		
		//Assignment_7_Selection Control Structure
		//date_month_year_addition
		//edit for case 28 later
	/*	
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the year");

		int year = in.nextInt();

		System.out.println("Enter the month");

		int month = in.nextInt();

		System.out.println("Enter the day");

		int day = in.nextInt();

		boolean leapYear = false;

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))

			leapYear = true;

		if (leapYear) {

			switch(day)
			{
			
		    case 29:

			case 30:

			case 31:				

				day=1;

				if(month==12)	
				{				
					month=1;
					year++;
					
				}else
					
				{
					month++;
				}

				 break;	

			default:					
			day++;			
			}
		}
		
		    else
		    {		   
		    	
			switch(day)	
			
			{
			case 28:

			case 30:

			case 31:
				
					day=1;

				if(month==12)	
				{				
					month=1;
					year++;
				}
				
				else
				{
					month++;
				}
				 break;

			default:

				day++;
			}

		}

		System.out.println(day+"-"+month+"-"+year);

                */

	



		




          //Assignment_8_Selection Control Structure
		
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
	       int num = sc.nextInt();
	       
	       if (num%3==0 && num%5==0) {
			System.out.println("Zoom");
		} 
	       else if(num%5==0) {
         System.out.println("Zap");
		} 
	       else if(num%3==0) {
			System.out.println("Zip");
		}
		
		else {
			System.out.println("invalid");
			
		}
		
		*/
		
		
		//Iteration Control Structure - exercise  1
		//Implement a program to calculate the factorial of a given number.
	/*	
		int num =7,temp;
		
		temp=num;
		while(num>1)
		{	
			
			temp = temp * (num-1);          //5*4=20 
			num=num-1;                                //20*3=60
			                             //60*2=12
		}
		
		System.out.println("The factorial is " +temp);
		
		*/
		
		
		
		//Iteration Control Structure - exercise  2
		//Implement a program to display the geometric sequence as given below for a given value n, 
		//where n is the number of elements in the sequence.
        //1, 2, 4, 8, 16, 32, 64, ......, 1024
		
	/*	
		int n=5,sequence=1;	
	
	while(n!=0)
    {
    	System.out.println(sequence);;
    	sequence*=2;
    	n-=1;
    }
	
	    
		*/
	
		
		
	
		
		
		//Iteration Control Structure - Assignment 1
		
//		Problem Statement
//		Implement a program to check whether a given number is a palindrome.
	
		/*
		Scanner sc = new Scanner(System.in);
		int rev =0, temp;
		
		System.out.println("Enter a number");
		int digit = sc.nextInt();
		
		temp=digit;
		
		while (digit >0 )
		{
			rev   =  (rev * 10)+ digit%10;
		    digit =  digit/10;
		}
		
		if (rev==temp)
		{
			System.out.println("The number is plaindrome " );
		}
		else {
			System.out.println("It is not a plaindrome");
		}
		
		*/
		
		//Iteration Control Structure - Assignment 2
		// rabbits and chicken problem
		//Implement a program to find the number of rabbits and chickens in a farm. 
//		Given the number of heads and legs of the chickens and rabbits in a farm, 
//		identify and display the number of chickens and rabbits in the farm.
	/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the no. of heads ");
		int head = sc.nextInt();
		System.out.println("Enter the no. of legs ");
		int legs = sc.nextInt();
		int r,c;
		
		if (legs%2 !=0 || head==0 || head>legs ) {
			System.out.println("invalid input");
		}
		else {
			r = ((legs + (-2*head))/2);
			c = head-r;
			System.out.println("No. of rabbits ->"  +r);
			System.out.println("No. of chicken ->"  +c);
		}
	
	*/
	
		//Iteration Control Structure - Assignment 3
	//Implement a program to find out whether a number is divisible by the sum of its digits.
	/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num =sc.nextInt();
	    int sum=0,temp;
	    temp=num;
	    
	    while (num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		if (temp % sum==0) {
			System.out.println("it is divisble by its sum of digit");
		}
		else {
			System.out.println("it is not divisble by its sum of digit");
		}
		
		*/
		
		
		
		//Iteration Control Structure - Assignment 4
//		Implement a program to find out whether a number is a seed of another number.
//		A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.
	
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number ");
		int num1 =sc.nextInt();
		System.out.println("Enter 2nd number ");
		int num2 =sc.nextInt();
		
		
		int prod=1,temp;
		temp=num1;
		
		while (num1>0) {
			prod = prod* (num1 % 10);
			num1 = num1/10;
		}
		if (temp*prod == num2) {
			System.out.println("The 1st number is seed of 2nd number ");
		}
		else {
			System.out.println("The 1st number is not seed of 2nd number ");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		//Iteration Control Structure - Assignment 5
		/*
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num =sc.nextInt();
		
		int temp, count=0,digit, prod, sum=0;
		temp=num;
		
		 //to calculate number of digits or count
		while (temp>0) {
			count=count+1;
		    temp=temp/10;
		}
		
		temp=num;
		
		while (temp>0) {
			digit = temp%10;
			prod=1;
			
			for(int i=1;i<=count;i++) {
				prod=prod*digit;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		
		if (sum==num) {
			System.out.println("Number is Armstrong");
			
		}
		else {
			System.out.println("Number is not Armstrong");
		}
			
		*/
		
		
		
		
		
		
		

		
		
		
		//Iteration Control Structure - Assignment 6
		
		
		/*
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1st number ");
			int num1 =sc.nextInt();
			System.out.println("Enter 2nd number ");
			int num2 =sc.nextInt();
	     
             int l,lcm,i;
             
             l = num1>num2 ? num1 : num2;
             
             for (i = l; i <= num1*num2; i+=l) {
				
            	 if (i%num1==0 && i%num2==0) {
					break;
				}
            	 lcm=i;
			}
             System.out.println("lcm is " +i);
		
		
		*/
		
		
		
		
		
		
		//Iteration Control Structure - Assignment 7
		//lucky number
	/*	
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number ");
			int num =sc.nextInt();
		
		   int lucky_num =0;
		   
		   int temp, count=0,digit, sum=0;
			temp=num;
			
			 //to calculate number of digits or count
		
			while (temp>0) {
				count=count+1;
			    temp=temp/10;
			}
		
			temp=num;
		while (temp>0) {
			digit=temp%10;
			if (count%2==0) 
				lucky_num=lucky_num+(digit*digit);
				temp=temp/10;
				count=count-1;
	
		}
		
		if (lucky_num%9==0) {
			System.out.println(num+ "Is a lucky numner ");
		}
		
		
	         */
	 
	 
	 
		
		
		//Iteration Control Structure - Assignment 8
	/*	
		for (int i = 0; i <=4 ; i++) {
			
			for (int j = 0; j <=4-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		*/
		
		
		
	
	
		
	}
	
}
				



