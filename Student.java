public class Student {

	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	private static int max = 100;
	
	public static int getNextStudentID(){
		return max++;
	}
	
	public Student(String name, String mobile, String degree) {
		this.name = name;
		this.mobile = mobile;
		this.degree = degree;
		this.studentID = Student.getNextStudentID();
	}
	
	public void print() {
		System.out.println("Student id is "+this.studentID);
		System.out.println("Student name is "+this.name);
		System.out.println("Student mobile is "+this.mobile);
		System.out.println("Student degree is "+this.degree);
	}	
	
	//getters
	public String getName() {
		return this.name;
	}
	public String getMobile() {
		return this.mobile;
	}
	public String getDegree() {
		return this.degree;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
