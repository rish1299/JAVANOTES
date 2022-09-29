package arrayassignment3;

public class Que_6 {
     
	public static int findTotalCount(int[] numbers) {
		//Implement your code here and change the return value accordingly
	    int n = numbers.length-1,count=0;	
		for (int i = 0; i <n; i++) {
			if (numbers[i]==numbers[i+1]) {
				count++;			
				}
		}	
        return  count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	}

}
