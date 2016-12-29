package tasks.employee;

public class Task {

		private String name;
		private byte workingHours;
		private String owner;

		

		Task(String name, byte workingHours){
			
			setName(name);
			setWorkingHours(workingHours);	
		}

		String getName() {
			return name;
		}

		void setName(String name) {
			if(name != null && name.length() > 2){
				this.name = name;
			}
		}

		byte getWorkingHours() {
			return workingHours;
		}

		void setWorkingHours(byte workingHours) {
			if(workingHours > 0){
				this.workingHours = workingHours;
			}
		}
		
		String getOwner() {
			return owner;
		}
	}

