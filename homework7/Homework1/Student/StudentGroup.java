package Homework1.Student;

public class StudentGroup {

	final byte NUMBER_OF_PLACES = 5; 
	String groupSubject;
	Student [] students;
	byte curSize;
	byte freePlaces;
	
	public StudentGroup(){
		curSize = NUMBER_OF_PLACES;
		this.students = new Student[curSize];
		freePlaces = NUMBER_OF_PLACES;
	}

	public StudentGroup(String groupSubject){
		this();
		if(groupSubject != null && groupSubject.length() > 3){
			this.groupSubject = groupSubject;
		}
		else{
			System.out.println("There is no such a group subject! ");
		}
	}
	
	void addStudent(Student a){

		if(a.subject.equalsIgnoreCase(this.groupSubject) && freePlaces > 1){
			this.students[curSize] = a;
			this.curSize++;
			this.freePlaces--;
		}
		else{
			System.out.println("There is a problem with adding a student. He may have another subject or there are not free places here.  ");
		}
		
	}
	
	void emptyGroup(){
		this.curSize = NUMBER_OF_PLACES;
		this.students = new Student[this.curSize];
		this.freePlaces = NUMBER_OF_PLACES;
	}
	
	public String theBestStudent(){
		
		int indexBestStudent = 0;
		float maxGrade = students[0].grade;
		for (int index = 0; index < students.length; index++) {			
			if(students[index].grade > maxGrade){
				maxGrade = students[index].grade;
				indexBestStudent = index;
			}		
		}
		
		return students[indexBestStudent].name;
	}
	
	public void printStudentsInGroup(){
		
		for (int index = 0; index < students.length; index++) {
			
			System.out.println("Student number: " + (index+1));
			System.out.println("Name: " + students[index].name);
			System.out.println("Subject: " + students[index].subject);
			System.out.println("Age: " + students[index].age);
			System.out.println("Year in college: " + students[index].yearInCollege);
			System.out.println("Grade: " + students[index].grade);
			System.out.println("Money from scholarships: " + students[index].money);
			
		}
		
	}
	
	
	
}
