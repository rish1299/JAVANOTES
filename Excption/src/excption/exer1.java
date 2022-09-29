package excption;
class Application{
	private String name;
	private String jobProfile;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobProfile() {
		return jobProfile;
	}
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


class Validator{
	
	public boolean validateName(String name) {}
	
	
	public boolean validateJobProfile(String jobProfile) {}
	
	public boolean validateage(int age) {}
	
	
	
	public void validate(Application application) {}
} 




public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
