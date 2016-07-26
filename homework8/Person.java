package homework;

public class Person {

	private String name;
	private byte age;
	private boolean isMale;
	
	public Person(String name, byte age, boolean isMale) {
		
		if(name != null && name.length() > 2){
			this.name = name;
		}
		else{
			System.out.println("Invalid person name! ");
		}
		
		if(age > 0 && age < 100){
			this.age = age;
		}
		else{
			System.out.println("Invalid age! ");
		}
		
		this.isMale = isMale;
		
	}
	
	public void showPersonInfo(){
		
		System.out.println("Person's name: " + this.name);
		System.out.println("Person's age: " + this.age);
		System.out.println("Person's gender(Is the person male?): " + this.isMale);
	}
	
	
	public String getName() {
		return this.name;
	}

	public byte getAge(){
		return this.age;
	}
	
}
