package arrayassignment3;
class Student{
	 private int[] marks;
	 private char[] grade;
	
	 
	 public Student(int[] marks) {
		this.marks = marks;
		this.grade = new char[marks.length];
	}


	 
	 public int[] getMarks() {
		return marks;
	}



	public void setMarks(int[] marks) {
		this.marks = marks;
	}



	public char[] getGrade() {
		return grade;
	}



	public void setGrade(char[] grade) {
		this.grade = grade;
	}



	public void findGrade() 
	{
		 for (int i = 0; i < marks.length; i++) {
			
		
		if (marks[i]>=92) {
			
			
			grade[i]  = 'E';
		} else if (marks[i]>=85 && marks[i]<92) {
			
			grade[i] = 'A';
			
		}
		else if (marks[i]>=70 && marks[i]<85) {
			grade[i]= 'B';
		}
		else if (marks[i]>=65 && marks[i]<70) {		
			grade[i]= 'C';
		}
		else if (marks[i]<65) {
			grade[i]= 'D';
		}
		
		 }
		
	 }
	 
}



class Que_4 {
	 	 
	 public static void main(String[] args) {
		 int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
			Student student = new Student(marks);
			student.findGrade();
	        System.out.println("Grades corresponding to the marks are : ");
			char[] grades = student.getGrade();
			for (int index = 0; index < grades.length; index++) {
				System.out.print(grades[index] + " ");	 
	}
	 
	
	 
  }
} 
   





