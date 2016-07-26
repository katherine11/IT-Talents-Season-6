package homework;

public class Student extends Person {
	
	private static final int MAX_GRADE = 6;
	private static final int MIN_GRADE = 2;
	private float grade;
	
	public Student(String name, int age, boolean isMale, float grade){
		
		super(name,(byte)age,isMale);		
		if(grade >= MIN_GRADE && grade <= MAX_GRADE){
			this.grade = grade;
		}
		else{
			System.out.println("Invalid grade! ");
		}
		
	}
	
	public void showStudentInfo(){
		
		showPersonInfo();
		System.out.println("Student's grade: " + this.grade);
	}
	
	
}
