package CarTask;

public class Person {

	String name;
	byte age;
	//creates three blocks of memory:
	Person[] friends = new Person[3];
	byte curSize;
	long personalNumber;
	Gender isMale;
	double weight;
	double money;
	Car car;
		
	Person(){
		this.weight = 4.0f;
	}
	
	Person(String name, long personalNumber, Gender isMale){
		this();
		if(this.name != null && this.name.length() >=2){
			this.name = name;
		}
		
		if(personalNumber > 0 && ("" + personalNumber).length() == 10){
			this.personalNumber = personalNumber;
		}
		
		this.isMale = isMale;
		
	}

	void addFriend(Person friend) {

		if (curSize > 5) {
			System.out.println("There is no space available! ");
		}

		friends = new Person[5];
		friends[curSize] = friend;
		curSize++;

	}

	void removeFriend(Person friend) {

		if (curSize <= 0) {
			System.out.println("There are no friends to remove! ");
		} else {
			for (int index = 0; index < friends.length; index++) {

				if (friends[index] == friend) {

					friends[curSize] = friend;
					curSize--;

				} else {

					System.out.println("There is not such a friend here! ");
				}
			}
		}
	}
	
	void buyCar(Car car){
		
		if(this.money >= car.price){
			this.car = car;
		}
		
	}

	void setMoney(double money){
		if(money >= 0 && money <= 10000){
			this.money = money;
		}
	}
	
}
	


