package homework;

public class Demo {

	public static void main(String[] args) {


		Person [] people = new Person[10];
		Person mihail = new Person("Misho",(byte)20,true);
		Person mariana = new Person("Mimeto", (byte)19, false);
		Person ilian = new Student("Ilian", (byte)16, true, (float)4.5);
		Person nataly = new Student("Nati", (byte)18, false, (float)5.88);
		Person grigor = new Employee("Grisho", (byte)25, true, (float)50);
		Person emilia = new Employee("Emi",(byte)17,false, (float)35);
		
		people[0] = mihail;
		people[1] = mariana;
		people[2] = ilian;
		people[3] = nataly;
		people[4] = grigor;
		people[5] = emilia;
		
		for (int index = 0; index < people.length; index++) {
			
			if(people[index] instanceof Person){
				people[index].showPersonInfo();
			}
			
			if(people[index] instanceof Student){
				((Student) people[index]).showStudentInfo();
			}
			
			if(people[index] instanceof Employee){
				((Employee) people[index]).showEmployeeInfo();
			}
		}
		
		
		for (int index = 0; index < people.length; index++) {
			
			if(people[index] instanceof Employee){
				System.out.println("Employee's name: " + people[index].getName());
				System.out.println("Day salary along with overtime working price: ");
				System.out.println(((Employee)people[index]).calculateOverTime(2));
			}
			
		}
		
		
		
		
		
	}

}
