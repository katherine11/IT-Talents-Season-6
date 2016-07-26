package CarTask;

public class CarShop {

	final int MAX_CAPACIY_OF_CARS = 40000;
	Car[] cars;
	int capacity;
	static int index;

	static {
		index = 0;
	}

	CarShop(int capacity) {
		this.cars = new Car[capacity];
	}

	boolean addCar(Car car) {

		if (this.capacity >= MAX_CAPACIY_OF_CARS) {
			System.out.println("There is not enough space! ");
			return false;
		} else {
			cars[capacity] = car;
			this.capacity++;
			System.out.println("The car was successfully added! ");
			return true;
		}
	}

	Car getNextCar() {

		index++;
		return cars[index];
	}

	void sellNextCar(Person buyer) {

		if (buyer != null) {
			System.out.println("Successfully bought car!");
			buyer.buyCar(getNextCar());
		}
	}

	boolean removeCar(Car car) {

		if (car != null) {
			for (int index = 0; index < cars.length; index++) {

				if (this.cars[index] == car && capacity >= 0) {
					this.cars[index] = this.cars[this.capacity - 1];
					this.capacity--;
					return true;
				}
			}
			return false;
		}
		return false;
	}
	
	void showAllCarsIntTheShop(){
		
		for (int index = 0; index < cars.length; index++) {
			
			System.out.println("Car number: " + (index+1));
			System.out.println("Model: " + this.cars[index].model);
			System.out.println("Max speed: " + this.cars[index].maxSpeed);
			System.out.println("Current speed: " + this.cars[index].currentGear);
			System.out.println("Color: " + this.cars[index].color);
			System.out.println("Owner: " + this.cars[index].owner);
			System.out.println("Price: " + this.cars[index].price);
			System.out.println("Is sport car: " + this.cars[index].isSportCar);
	
		}
		
	}

}
