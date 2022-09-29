 package practise.java;
class Addition3
{
	int c;
	
	//void means it will return any value
    int add(int x, int y)
    {
    	c = x+y;
    	return c;
    }
}
public class Tap_java_methods_p4 {
	
	public static void main(String[] args) {
		Addition3 ref = new Addition3();
		int a,b,res;
		a = 40;
		b = 60;
	
		res = ref.add(a,b);
		System.out.println(res);

	}

}
