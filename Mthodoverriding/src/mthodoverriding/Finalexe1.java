package mthodoverriding;

class Student {
	
	final private int stipend=100;
	private int studentId;
	private int aggregateMarks;
	public int getStipend() {
		return stipend;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int StudentId ) {
		this.studentId= StudentId;
	}
	
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	
	public double calculateTotalStipend() {
		int tmp=0;
		tmp=stipend;
		double res=0.0;
		
		if (aggregateMarks>=85 && aggregateMarks<90) {
			int bonus=10; 
			res=tmp+bonus;
			
			
		} else if (aggregateMarks>=90 && aggregateMarks<95) {
			int bonus=15; 
			res=tmp+bonus;
			
		}
		else if (aggregateMarks>=95 && aggregateMarks<=100) {
			int bonus=20;
			res=tmp+bonus;
			
		}
		else if (aggregateMarks<85) {
			int bonus=0;
			res=tmp+bonus;
			
		}
		
		return res;
	}
	
	
	
	
}
public class Finalexe1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);

	}

}
