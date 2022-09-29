package practise.java;

public class Tap2_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SAURAV";
		String s2 = "SACHIN";
		int result = s1.compareTo(s2);
		if (result == 0)
		{
			System.out.println("s1 is equals to s2");
		}
		else if (result>0)
		{
			System.out.println("s1 is greater than to s2");
		}
		else 
		{
			System.out.println("s1 is lesser than s2");
		}
	}

}
