package arrayassignment3;



class Teacher{
	
	public String teacherName;
	public String subject;
	public double salary;
	 
	public Teacher(String teacherName, String subject, double salary) {
		
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
		
		
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getsubject() {
		return subject;
	}

	public void subject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayTeacherInfo()
	{
		System.out.println("Teacher Name : "+this.teacherName);
		System.out.println("Teacher Subject : "+this.subject);
		System.out.println("Teacher Salary : "+this.salary);
	}
	
	
}





public class Que_1 {

	public static void main(String[] args) {
	
	        Teacher[] tarry = new Teacher[4];
		
			tarry[0] = new Teacher("Alex", "Java Foundation", 1200L);
			tarry[1] = new Teacher("John", "RDMS" , 800L);
			tarry[2] = new Teacher("Sam", "Networking", 900L);
			tarry[3] = new Teacher("Maria", "Python", 900L);
			
			for (int i = 0; i < tarry.length; i++) {
				tarry[i].displayTeacherInfo();
			}
			System.out.println("**********************");
	}

}





