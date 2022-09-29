package mthodoverriding;

class Mobile {
	
	private String name;
	private String brand;
	private String operatingSystemName;
	private String operatingSystemVersion;
	
	
	public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
		
		this.name = name;
		this.brand = brand;
		this.operatingSystemName = operatingSystemName;
		this.operatingSystemVersion = operatingSystemVersion;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getOperatingSystemName() {
		return operatingSystemName;
	}


	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}


	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}


	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
		
	
}


interface Testable{
	
	
	public boolean testCompatibility();
	
}

class SmartPhone extends Mobile implements Testable
{
	private String networkGeneration;
	
	
	public SmartPhone (  String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration  )
	{
		super(name, brand, operatingSystemName, operatingSystemVersion);
		this.networkGeneration=networkGeneration;
		
	}


	public String getNetworkGeneration() {
		return networkGeneration;
	}


	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}

	
	
	public boolean testCompatibility()
	{
		
		if ( this.getOperatingSystemName().equals("Saturn")  )
		 
		{	
			if	(networkGeneration.equals("3G") && this.getOperatingSystemVersion().equals("1.1") ) {
				return true;	
			} 
		
			else if	(networkGeneration.equals("3G") && this.getOperatingSystemVersion().equals("1.2") ) {
					return true;
			}
			else if (networkGeneration.equals("3G") && this.getOperatingSystemVersion().equals("1.1")) {
                     return true;
			}	
			
			
			else if (networkGeneration.equals("4G") && this.getOperatingSystemVersion().equals("1.2")) {
                return true;
		}	
			
			else if (networkGeneration.equals("4G") && this.getOperatingSystemVersion().equals("1.3")) {
                return true;
		}	
			
			else if (networkGeneration.equals("5G") && this.getOperatingSystemVersion().equals("1.3")) {
                return true;
		}	
			else {
				return false;
			}
			
			
		}
		
			

			if (this.getOperatingSystemName().equals("Gara")  )
		
				 
			{
					
					if	(networkGeneration.equals("3G") && this.getOperatingSystemVersion().equals("EXRT.1") ) {
						return true;	
					} 
				
					else if	(networkGeneration.equals("3G") && this.getOperatingSystemVersion().equals("EXRT.2") ) {
							return true;
					}
					else if (networkGeneration.equals("3G") && this.getOperatingSystemVersion().equals("EXRU..1")) {
		                     return true;
					}	
					
					
					
					
					else if (networkGeneration.equals("4G") && this.getOperatingSystemVersion().equals("EXRU.1")) {
		                return true;
				}	
					
					else if (networkGeneration.equals("4G") && this.getOperatingSystemVersion().equals("EXRT.2")) {
		                return true;
				}	
					
					
					
					else if (networkGeneration.equals("5G") && this.getOperatingSystemVersion().equals("EXRU.1")) {
		                return true;
				}	
				
					else {
						return false;
					}
				
			}
			
		
			else 
				return false;
		
	}
	
	
	
	


}







public class Interfceassgnment1 {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");

	}

}
