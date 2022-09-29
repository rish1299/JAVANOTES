package stringAssignment;





public class Que2 {

	public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
		int i,j,f;
		i=0;
		j=str.length()-1;
		f=0;
		boolean b1 = true;
		boolean b2 = false;
		
		
		while (i<j && f==0) {
		
			
			if(str.charAt(i)!=str.charAt(j))
				f=1;
			
			i=i+1;
			j=j-1;
		}
		
		if(f==0) 
        return b1;
		return b2;
		
		
	}
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

}
