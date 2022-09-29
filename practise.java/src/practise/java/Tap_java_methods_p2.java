package practise.java;
//method with input but no output
class Addition1
{
	int c;
	
	//void means it will return any value
    void add(int x, int y)
    {
    	c = x+y;
    	System.out.println(c);
    }
}
public class Tap_java_methods_p2 {

	public static void main(String[] args) {
		Addition1 ref = new Addition1();
		int a,b;
		a = 10;
		b = 80;
		ref.add(a, b);
		
	}

}
