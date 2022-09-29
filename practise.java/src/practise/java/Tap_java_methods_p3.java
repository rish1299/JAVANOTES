package practise.java;
//no inout and have output (i.e it has a return )
class Addition2
{
	int a, b, c;
	
	int add()
	{
		a=10;
		b=20;
		c=a+b;
		
		return c;
	
	}
}	

public class Tap_java_methods_p3 {

	public static void main(String[] args) {
		Addition2 ref = new Addition2();
		int res;
		res = ref.add();
		System.out.println(res);

	}

}
