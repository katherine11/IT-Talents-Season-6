package homework;

public class Employee extends Person {

		private final float COEF_OF_OVERTIME_SALARY = (float) 1.5;
		private final byte AGE_NEEDED_FOR_WORKING = 18;
		private final byte DAILY_WORKING_HOURS = 8;
		private float daySalary;
		
		public Employee(String name, byte age, boolean isMale, float daySalary){
		
			super(name, (byte)age, isMale);
			if(daySalary > 10f && daySalary <= 100f){
				this.daySalary = daySalary;
			}
			else{
				System.out.println("Invalid salary! ");
			}
			
		}
		
		
		float calculateOverTime(float hours){
			
			if(this.getAge() > AGE_NEEDED_FOR_WORKING){
				float hourSalary = this.daySalary/DAILY_WORKING_HOURS;
				daySalary += hourSalary*COEF_OF_OVERTIME_SALARY;
			}
			else{
				System.out.println("No overtime income! ");
			}
			return this.daySalary;
		}
		
		
		public void showEmployeeInfo(){
			showPersonInfo();
			System.out.println("Employee's day salary: " + this.daySalary);
		}

}
