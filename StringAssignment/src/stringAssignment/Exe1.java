package stringAssignment;

public class Exe1 {
	public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
       str=str.replaceAll(" ","");
        return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}

}
