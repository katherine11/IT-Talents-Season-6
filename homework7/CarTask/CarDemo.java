package CarTask;

public class CarDemo {
	public static void main(String[] args) {
	
		
//				Car car1 = new Car();
//				Car car2 = new Car();
//				
//				
//				car1.model = "Audi A8";
//				car1.maxSpeed = 240;
//				car1.currentSpeed = 150;
//				car1.color = "black";
//				car1.currentGear = '5';
//				
//				car2.model = "Honda";
//				car2.maxSpeed = 230;
//				car2.currentSpeed = 120;
//				car2.color = "red";
//				car2.currentGear = 'F';
//				
//				car2.currentGear = '4';
//				car2.currentSpeed += 60;
//				
//				car1.owner = new Person();
//				car1.owner.name = "Nikolay";
//				car1.owner.age = 19;
//				
//				
//				if(car1.owner != null){
//				
//				System.out.println("Car 1 name:  " + car1.owner.name);
//				System.out.println("Car 1 age: " + car1.owner.age);
//				}
//				//car1.friend = new Person();
//				//car1.friend.name = "Gancho";
//				//car1.friend.age = 20;
//				
				Car audi = new Car("", true, "black");
				Car car = new Car(3000);
				
				System.out.println(audi.isMoreExpensive(car));
				System.out.println(car.model);
				
				
				
				
			
			}

		}

