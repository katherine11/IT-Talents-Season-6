package Homework2;

public class TestEmployee {

	public static void main(String[] args) {

		Task task = new Task("Sell 3 cars! ", (byte)50);
		System.out.println(task.getName());
		Employee kaziyski = new Employee("Matey");
		kaziyski.setHoursLeft((byte) 3);
		kaziyski.setCurrentTask(task);
		kaziyski.showReport();
		
		
	}

}
