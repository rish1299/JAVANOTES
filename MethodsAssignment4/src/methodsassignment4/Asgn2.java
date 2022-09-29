package methodsassignment4;


class Resturant {
    public  String resturantName;
    public  long resturantContact;
    public  String resturantAdress;
    public  float resturantRating;
     
     public void displayResturantDetails() 
     {
    	 System.out.println("Resturant Name " +resturantName);
    	 System.out.println("Resturant Rating " +resturantRating);
    	 System.out.println("Resturant Contact " +resturantContact);
    	 System.out.println("Resturant Adress " +resturantAdress);
    
     }
     
}
     
public class Asgn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resturant res = new Resturant();
        res.resturantName="McDonald's";
        res.resturantRating=4.1f;
        res.resturantContact=9988676767L;
        res.resturantAdress="SH1109, carolina street, springfiled";
        res.displayResturantDetails();
	}

}
