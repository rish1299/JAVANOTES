package arrayassignment3;

class    Afteacher {
    
    public static double[] findDetails(double[] salary) {
        
    	double[] sdetail = new double[3];
    	double avg=0, grt=0, less=0;
    	
    	for (int i = 0; i < salary.length; i++) {
		   avg = avg+salary[i];	
		}
    	
    	avg = avg/salary.length;
    	
    	for (int i = 0; i < salary.length; i++) 
    	{
    		if (salary[i]>avg)
    			grt++;
    		else
    			less++;
    	}
    	
    	sdetail[0] = avg;
    	sdetail[1] = grt;
    	sdetail[2] = less;
    
    		return sdetail;     

    }
}
    
public class Que_2 {

	public static void main(String[] args) {
		double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        Afteacher th = new Afteacher();
       
		double[] details = th.findDetails(salary);
        
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);

	}
 
}









