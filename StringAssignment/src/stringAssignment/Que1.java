package stringAssignment;




// my sol work on this 
/*
 * 
 * 
 * 
public static String moveSpecialCharacters(String str){
	//Implement your code here and change the return value accordingly
	String result="";
	String result1="";
	String result2="";
	for (int i = 0; i < str.length(); i++) {
		
		if (str.charAt(i)>65 && str.charAt(i)<=90) {
			result1=result1+str.charAt(i);
		}
		else if (str.charAt(i)>97 && str.charAt(i)<=122){
			result1=result1+str.charAt(i);
		}
		else if (str.charAt(i)>48 && str.charAt(i)<=57){
			result1=result1+str.charAt(i);
		}
	
		if(str.charAt(i)<48 && str.charAt(i)>123) || str.charAt(i)>=91 || str.charAt(i)<=97)  {
			result2=result2+str.charAt(i);
		}
		else if ( str.charAt(i)>=91 || str.charAt(i)<=97) {
			
		}
		result=result1+result2;
	}
	        return result;
}





*/







/* class Te{

    public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
			 str = str.replaceAll(" ","");

         return str;
	}
}
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Te tt = new Te();
		String str = "Hello   How are you   ";
		str = tt.removeWhiteSpaces(str);
		System.out.println(str);
	}

}

*/

public class Que1 {

	 
	// TODO Auto-generated method stub
	public static String moveSpecialCharacters(String str){
	    String a=str.toLowerCase();
	   
	    String  e="",d="";
	    for(int i=0; i<str.length(); i++)
	    {
	         for(int j=97; j<123; j++)
	         {
		        if(a.charAt(i)==j)
	                {
	                     d=d.concat(str.substring(i,i+1));			     
				break;	
	              }
	              if(j==122 )
	              {
	                   e=e.concat(str.substring(i,i+1));
                     
				break;
                            
	              }
	         }
	    }
	    String f=d.concat(e);
	    return f;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	

}



