package practise.java;

import java.util.StringTokenizer;

public class Tap5_str {

	public static void main(String[] args) {
		//STRING_TOKENIZER_METHOD
		
//       String s = "JAVA PYTHON SQL AI";
//       StringTokenizer st = new StringTokenizer(s," ");
//       while (st.hasMoreTokens() ==true) 
//       {
//		System.out.println(st.nextToken());
//	   }
//       
		String s = "JAVA PYTHON SQL AI";
	       StringTokenizer st = new StringTokenizer(s,"A");
	       while (st.hasMoreTokens() ==true) 
	       {
			System.out.println(st.nextToken());
		   }
	} 
	
	

}
