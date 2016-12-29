package tasks.employee;

public class Employee {

	final private byte MAX_DAILY_WOKRING_HOURS = 8;
	private String name;
	private Task currentTask;
	private byte hoursLeft;
	private AllWork allWork;
	private boolean endOfTheDay;

	Employee(String name) {
		if (name != null && name != "" && name.length() > 2) {
			this.name = name;
		} else {
			System.out.println("Invalid name given! ");
		}
	}

	Employee(String name, AllWork allwork) {
		this(name);
		if (allwork != null) {
			this.allWork = allwork;
		} else {
			System.out.println("Incorrect object for all work given! ");
		}
	}

	void startWorkingDay() {

		this.hoursLeft = this.MAX_DAILY_WOKRING_HOURS;
		this.endOfTheDay = false;
		System.out.println("Start of the new working day - hours left: " + this.hoursLeft);
		if (this.currentTask != null) {
			System.out.println("Current task: " + this.currentTask.getName());
		}
	}

	void work() {

		startWorkingDay();

		while (!isEndOfTheDay()) {

			completingTasks();

			if (this.allWork.isAllWorkDone()) {
				break;
			}

		}

	}

	void completingTasks() {
		// the rest of the hours for completing the task equals the difference
		// between the working hours needed and the current ammount of past
		// hours:

		if (this.currentTask != null) {
			if (this.currentTask.getWorkingHours() == 0) {
				System.out.println("The current task has been completed! Let's get a new task! ");

				if (this.allWork.getFreePlacesForTasks() > 0) {
					employeeNextTask();
				} else {
					System.out.println("All work is done! There are no more tasks to complete! ");
				}
			}

			else {

				if (this.hoursLeft == 0) {
					endOfTheDay = true;
				}

				if (!this.endOfTheDay) {
					System.out.println("Still working on the current task! ");
					if (calculateWorkingHours() != 0) {
						employeeNextTask();
					}

				}

				else {
					System.out.println("End of the current working day! Tommorrow " + this.getName()
							+ " will continue with his/her work! ");
				}
			}

		} else {
			System.out.println("No current task available! ");
		}
	}

	void employeeNextTask() {
		this.currentTask = this.allWork.getNextTask();

		if (this.allWork.getNextTask() != null) {
			System.out.println("Next task: " + this.allWork.getNextTask().getName());
		} else {
			System.out.println("There are no more free tasks! ");
		}
	}

	byte calculateWorkingHours() {

		byte differenceInHours = (byte) (this.currentTask.getWorkingHours() - this.hoursLeft);
		this.currentTask.setWorkingHours(differenceInHours);

		if (this.currentTask.getWorkingHours() > this.hoursLeft) {
			this.hoursLeft = 0;
		} else {
			this.hoursLeft -= (byte) Math.abs(differenceInHours);
		}

		System.out.println("There are " + this.hoursLeft + " working hours left for the day! ");
		System.out.println("There are " + differenceInHours
				+ " working hours left after this day for completing the current task! ");

		return this.hoursLeft;
	}

	void showReport() {
		System.out.println("Employee's name: " + this.name);
		if (this.currentTask != null) {
			System.out.println("Current task's name: " + this.currentTask.getName());
		}
		work();
	}

	Task getCurrentTask() {
		return currentTask;
	}

	void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Not valid current task! ");
		}
	}

	String getName() {
		return this.name;
	}

	AllWork getAllWork() {
		return allWork;
	}

	void setAllWork(AllWork allWork) {
		if (allWork != null) {
			this.allWork = allWork;
		} else {
			System.out.println("Incorrect object for all work given! ");
		}
	}

	byte getHoursLeft() {
		return hoursLeft;
	}

	void setHoursLeft(byte hoursLeft) {
		if (hoursLeft >= 0 && hoursLeft <= MAX_DAILY_WOKRING_HOURS) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Hours cannot be negative number or bigger than daily hours! ");
		}
	}

	boolean isEndOfTheDay() {
		return endOfTheDay;
	}

}
