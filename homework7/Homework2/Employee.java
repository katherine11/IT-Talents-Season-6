package Homework2;

public class Employee {

	final byte MAX_DAILY_WOKRING_HOURS = 8;
	private String name;
	private Task currentTask;
	private byte hoursLeft;
	
	Employee(String name){
		setName(name);
	}

	
	String getName(){
		return this.name;
	}
	
	void setName(String name) {
		if(name != null && name.length() > 2){
			this.name = name;
		}
		else{
			System.out.println("Invalid name given! ");
		}
	}


	byte getHoursLeft() {
		return hoursLeft;
	}


	void setHoursLeft(byte hoursLeft) {
		if(hoursLeft > 0 && hoursLeft <= MAX_DAILY_WOKRING_HOURS){
			this.hoursLeft = hoursLeft;
		}
		else{
			System.out.println("Hours cannot be negative number or bigger than daily hours! ");
		}
	}
	
	void work(){
		
		if(currentTask.getWorkingHours() > currentTask.MAX_WORKING_HOURS){
			System.out.println("The current task has been completed! ");
		}
		else{
			System.out.println("Working on my current task! ");
		}
		
		byte rest = (byte)(currentTask.MAX_WORKING_HOURS - currentTask.getWorkingHours());
		
		System.out.println("There are " + this.hoursLeft + " working hours left! ");
		System.out.println("There are " + (rest - hoursLeft) + " hours left for completing the current task for the day! ");
	
	}

	void showReport(){
		System.out.println("Employee's name: " + this.name);
		System.out.println("Current task's name: " + this.currentTask.getName());
		work();
	}
	
	
	public Task getCurrentTask() {
		return currentTask;
	}


	public void setCurrentTask(Task currentTask) {
		if(currentTask != null){
			this.currentTask = currentTask;
		}
		else{
			System.out.println("Not valid current task! ");
		}
	}

	
	
	
}

	

