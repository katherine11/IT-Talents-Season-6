package tasks.employee;

public class AllWork {

	final static byte MAX_TASKS_FOR_AN_EMPLOYEE = 7;
	private Task[] tasks;
	private byte freePlacesForTasks;
	private byte currentUnassignedTask;

	AllWork() {
		this.tasks = new Task[MAX_TASKS_FOR_AN_EMPLOYEE];
		this.freePlacesForTasks = (byte) (this.tasks.length - 1);
		this.currentUnassignedTask = 0;
	}

	void addTask(final Task task) {

		if (task != null && currentUnassignedTask < this.tasks.length) {
			this.tasks[this.currentUnassignedTask++] = task;
			this.freePlacesForTasks--;
		} else {
			System.out.println("Incorrect task given or there is no space for this task! ");
		}
	}

	Task getNextTask() {

		if (this.freePlacesForTasks > 0) {

			for (int index = 0; index < tasks.length; index++) {

				if (this.tasks[index] == null && !(this.tasks[index].equals(this.currentUnassignedTask))) {
					this.tasks[this.currentUnassignedTask] = null;
					this.currentUnassignedTask = (byte) index;
					this.freePlacesForTasks--;
				}
			}

			return this.tasks[this.currentUnassignedTask];
		}

		else {

//			this.currentUnassignedTask = 0;
			System.out.println("This was the last free task, if you have finished it - you have done all your tasks!");

		}

		return null;
	}

	boolean isAllWorkDone() {

		if (this.getNextTask() == null) {
			return true;
		}

		return false;
	}

	int getFreePlacesForTasks() {
		return this.freePlacesForTasks;
	}

	Task[] getTasks() {
		return tasks;
	}

}
