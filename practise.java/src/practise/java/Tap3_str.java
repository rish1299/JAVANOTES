package practise.java;

public class Tap3_str {

	public static void main(String[] args) {
		String s1 = "SACHIN";
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
