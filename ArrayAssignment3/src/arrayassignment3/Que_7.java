package arrayassignment3;



public class Que_7 {

      /*  
    	private String swap(String str, int i, int j)
    	{ 
    	char temp;
    	char[] carry = str.toCharArray();
    	temp=carry[i];
    	carry[i]=carry[j];
    	carry[j]=temp;
        return String.valueOf(carry);
    	}
    	
    	public void calculate(String str, int left, int right)
    	{
    		if(left == right) {
    			System.out.println(str);
    		}
    		else {
				for (int i =left; i <= right; i++) {
					String swapped = this.swap(str, left, i);
					this.calculate(swapped, left+1, right);
				}
			}
    		
    		
    		
    	}
    */
    	
	public static String[] findPermutations(String str)
	{ 
		 String combinations[]=new String[6]; 		
	     int counter=0;
	     char word[] = str.toCharArray(); 
	     
	     for (int first = 0; first < word.length; first++) 
	     { 
	    	 for (int second = 0; second < word.length; second++) 
	
	    	 { 
		
	    		 for (int third = 0; third < word.length; third++) 
		    { 
			if((!(first==second) && !(second==third) && !(first==third))) 
		    combinations[counter++]=word[first]+" "+word[second] + " " + word[third]; 
	         }
		
	     }
	
	 } 
	return combinations; 
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		    String str = "abc";
	        String permutations[] = findPermutations(str);

	        for(String permutation: permutations){

	            if (permutation!=null)

	                System.out.println(permutation);

	        }
        
	}

  }

