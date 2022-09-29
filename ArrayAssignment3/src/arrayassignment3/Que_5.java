package arrayassignment3;



 class Que_5 {
	 	 
	 public static int[] findNumbers(int num1, int num2) {
			int[] numbers = new int[6];

			// Implement your code here
	            if (num1<num2) {
	            	int n=0;
		            
		            for (int i = num1; i <= num2; i++) {
						int x = i%10;
						int y = i/10;
						int z = x+y;
						
						if (z % 3==0 && i %5==0 ) {
							numbers[n]=i;
							n++;
						}
					}
				}
	            
	            
			return numbers;
		}
	 
 
 
	 public static void main(String[] args) {
		 int num1 = 10;
			int num2 = 30;

			int[] numbers = findNumbers(num1, num2);
			if (numbers[0] == 0) 
			{
				System.out.println("There is no such number!");
			} 
			else 
			{
				for (int index = 0; index <= numbers.length - 1; index++) 
				{
					if (numbers[index] == 0) 
					{
						break;
					}
					System.out.println(numbers[index]);
				 }
             }
			
			
    } 
 }
