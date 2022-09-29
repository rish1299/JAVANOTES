package mthodoverriding;

class Faculty{
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;
	
	
	public Faculty(String name, float basicSalary) {
		
		this.name = name;
		this.basicSalary = basicSalary;
	    this.bonusPercentage = 0.04f;
	    this.carAllowancePercentage=0.025f;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}


	public float getBonusPercentage() {
		return bonusPercentage;
	}


	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}


	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}


	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
	public double calculateSalary() {
		
		//double res= this.getBasicSalary() * ( 1 + (this.getBonusPercentage()/100) + (this.getCarAllowancePercentage()/100 ) ) ;	     
		double res= this.getBasicSalary() +  this.getBasicSalary() * this.getBonusPercentage() + this.getBasicSalary() * this.getCarAllowancePercentage();
		this.setBasicSalary((float) res );
	     
		return res;
	}

	
}

class OfficeStaff extends Faculty{
	
	private String designation;
	
	public OfficeStaff(String name, float basicSalary, String designation)
	{
		super(name, basicSalary);
		this.designation=designation;
		
	}
	
	
	
	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public double calculateSalary() {
		 double addpay=super.calculateSalary();
		 double staffpay=0;
		 if (this.designation.equals("Accountant")) 
		 {
			
			 staffpay = addpay  +10000.0;
		}
		 else if (this.designation.equals("Clerk")) 
		 {
			
			 staffpay = addpay  +7000;
		}
		 else if (this.designation.equals("Peon")) 
		 {
			
			 staffpay = addpay  +4500;
		}
		 else {
			staffpay=addpay;
		}
		 
		 super.setBasicSalary((float) staffpay);
		return staffpay;
	}
	
	
}

class Teacher extends Faculty
{
	private String qualification;
	
	public Teacher ( String name, float basicSalary, String qualifications)
	{
		super(name, basicSalary);
		this.qualification=qualifications;
		
	}
	
	public String getQualification() {return qualification; }
	
	public void setQualification(String qualification ) {
		this.qualification=qualification;		
	}
	
	public double calculateSalary() {
		 double addypay=super.calculateSalary();
		 double tpay=0;
		 if (this.qualification.equals("Doctoral")) 
		 {
			
			 tpay=addypay+20000;
		}
		 else if (this.qualification.equals("Masters")) 
		 {
			
			 tpay=addypay+18000;
		}
		 else if (this.qualification.equals("Bachelors")) 
		 {
			
			 tpay=addypay+15500;
		}
		 else if (this.qualification.equals("Associate")) 
		 {
			
			 tpay=addypay+10000;
		}
		 else {
			tpay=addypay;
		}
		
		 super.setBasicSalary((float) tpay);
		return tpay;
	}
	
	
	
}






public class MethodOverAssgnment1 {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

	}

}
