package Homework1.Student;

public class Student {
	
	String name;
	String subject;
	float grade;
	byte yearInCollege;
	byte age;
	boolean isDegree;
	float money;
	
	
	Student(){
		grade = 4;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, String subject, byte age){
		
		this();
		
		if(name != null && name.length() >= 2){
			this.name = name;
		}
		else{
			System.out.println("Not valid name! ");
		}
		
		if(subject != null && subject.length() > 3){
			this.subject = subject;
		}
		else{
			System.out.println("Not valid subject name! ");
		}
		
		if(age > 0 && age <= 100){
			this.age = age;
		}
		else{
			System.out.println("Too many or invalid number of years! ");
		}
	}
	
	void upYear(){
		if(!this.isDegree){
			this.yearInCollege++;
		}
		
		if(yearInCollege >= 4){
			this.isDegree = true;
		}
	}
	
	double recieveScholarship(double min, double amount){
		
		if(min < 2 || min > 6){
			System.out.println("Such a grade does not exist! ");
		}
		
		if(amount < 0 || amount > 10000){
			System.out.println("Too much or invalid ammount of money for scholarship! ");
		}
		
		if(this.age <= 30 && this.grade >= min){
			this.money += amount;
		}
		
		return this.money;
	}
	
	
	

}
