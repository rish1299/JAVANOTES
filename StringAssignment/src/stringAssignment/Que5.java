package stringAssignment;

class Que_5 {
	 
	 public static String removeDuplicatesandSpaces(String str){
	        //Implement your code here and change the return value accordingly
		 String s1 ="";
		 for (int i = 0; i <str.length(); i++) {			
			 char c=str.charAt(i);			 
			 if (s1.indexOf(c)==-1) //indexOf gives the index value of character in string s1
				 s1+=c;                  // if no character is found, it will return -1 and (duplicate index) 
			                    // i.e. repeated character will give +1 or +ve value 
 }		 
	        return s1;
}
	 
	 
	 
	 
	 public static void main(String[] args) {
		
		   String str = "object oriented programming";
		    str=str.replaceAll(" ", "");
		   System.out.println(removeDuplicatesandSpaces(str));
         
		 
	}
	 
	
	 
}

   




