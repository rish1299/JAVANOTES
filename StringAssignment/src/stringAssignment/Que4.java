package stringAssignment;



public  class Que4 {
	
	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
		
		 int[] arr = new int[256];
		 int count = -1;
		  
		 for (int i = 0; i < str.length(); i++) {
			
			 arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		 
		for (int i = 0; i < str.length(); i++) {
			
			
			if (count<arr[str.charAt(i)]) {
				
				count = arr[str.charAt(i)] ;
			}
			
			
		}
		 return count;
	}
	
	
	public static void main(String[] args) {

		String str = "associated";
	    System.out.println(findHighestOccurrence(str));
		
		
		
	}



   }

