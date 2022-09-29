package stringAssignment;

public class Que3 {

	public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
       String s1 =new String();
       String s2 =new String();
       for(int i=str.length()-1;i>=0;i--)
       {
    	   s1=s1+str.charAt(i);
           if (str.charAt(i)==' ')
       {
            s2=s1+s2;
            s1="";
         }
         
         if(i==0) s2=s1+" "+s2;
         
       }
       return s2;
	}
	
 

	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
 }
 
 
  