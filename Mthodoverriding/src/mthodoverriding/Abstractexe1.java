package mthodoverriding;

abstract class Student1{
	private String studentName;
	private int[] testScore;
	private String testResult;
	
	public Student1(String studentName) {
		this.studentName = studentName;
		this.testScore=new int[4];   //initialise the arry
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScore() {
		return testScore;
	}

	public void setTestScore( int testNumber,int testScore) {
		this.testScore[testNumber] = testScore;     // [testNumber] is the index of the arry
	}

	public String getTestResult() {
		return testResult;
	}

	
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
		
	
	public abstract void generateResult();

}


class UndergraduateStudent extends Student1
{ 
	
	public UndergraduateStudent(String studentName) {super(studentName);}
	
	public void generateResult() {
		
		int testScore[]= super.getTestScore();   // testScore is stored in this arry 
		
		int total=0;
		for (int i = 0; i < testScore.length; i++) {
			total+=testScore[i];
		}
		
		double avg = total/testScore.length;
		
		if (avg>=60) {
			
			super.setTestResult("PASS");
			
		} 
		else if(avg<60) {
			super.setTestResult("FAIL");
		}
		
		
	 } 
}




class GraduateStudent extends Student1 
{
	
	public GraduateStudent(String studentName) {super(studentName);}
    
	public void generateResult() {
		
int testScore[]= super.getTestScore();
		
		int total=0;
		for (int i = 0; i < testScore.length; i++) {
			total+=testScore[i];
		}
		
		double avg = total/testScore.length;
		
		if (avg>=70) {
			
			super.setTestResult("PASS");
			
		} 
		else if(avg<70) {
			super.setTestResult("FAIL");
		}
		
		
	} 

}


public class Abstractexe1 {

	public static void main(String[] args) {
		UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        

	}

}
