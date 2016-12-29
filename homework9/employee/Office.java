package tasks.employee;

public class Office {

	public static void main(String[] args) {

		AllWork allwork = new AllWork();
		allwork.addTask(new Task("Sell 3 cars! ", (byte) 60));
		allwork.addTask(new Task("Buy 17 flowers for the boss's wife! ", (byte) 10));
		allwork.addTask(new Task("Find 5 new customers! ", (byte) 98));
		allwork.addTask(new Task("Clean the office! ", (byte) 5));
		allwork.addTask(new Task("Go to buy a lunch for the colleagues! ", (byte) 2));
		allwork.addTask(new Task("Add a new useful item in the office! ", (byte) 6));
		allwork.addTask(new Task("Make a statistics with the new rivals! ", (byte) 15));

		Employee joro = new Employee("Georgi", allwork);
		Employee pesho = new Employee("Petur", allwork);
		Employee iveto = new Employee("Ivana", allwork);
		Employee mimi = new Employee("Mariela", allwork);

		joro.setCurrentTask(allwork.getTasks()[0]);
		pesho.setCurrentTask(allwork.getTasks()[1]);
		iveto.setCurrentTask(allwork.getTasks()[2]);
		mimi.setCurrentTask(allwork.getTasks()[3]);

		while (allwork.isAllWorkDone()) {
			
			joro.showReport();
			System.out.println();
			pesho.showReport();
			System.out.println();
			iveto.showReport();
			System.out.println();
			mimi.showReport();
			System.out.println();

		}

	}

}
