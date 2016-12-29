package Homework2;

public class Task {

	final byte MAX_WORKING_HOURS = 100;
	private String name;
	private byte workingHours;

	Task(String name, byte workingHours){
		
		setName(name);
		setWorkingHours(workingHours);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && name.length() > 2){
			this.name = name;
		}
	}

	public byte getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(byte workingHours) {
		if(workingHours > 0 && workingHours <= MAX_WORKING_HOURS){
			this.workingHours = workingHours;
		}
	}
	
	
}