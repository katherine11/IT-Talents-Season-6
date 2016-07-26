package CarTask;

public class Car {

		String model = "Car";
		int maxSpeed;
		int currentSpeed;
		String color;
		char currentGear;
		char[] gears = { 'F', '1', '2', '3', '4', '5', 'B' };
		Person owner;
		double price;
		boolean isSportCar;

		Car(double price) {

			if (price > 0) {
				this.price = price;
			} else {
				System.out.println("There is no such price! ");
			}

		}
		
		Car(String model, boolean isSportCar, String color) {

			if (model != null && !model.equals("")) {
				this.model = model;
			} else {
				System.out.println("I don't know this model! ");
				this.model = "";
			}

			if (this.isSportCar || !this.isSportCar || isSportCar || !isSportCar) {
				this.isSportCar = isSportCar;
			} else {
				System.out.println("There are two values true or false!");
				this.isSportCar = false;
			}

			if (color != null && !color.equals("")) {
				this.color = color;
			} else {
				System.out.println("I don't know such a color! ");
			}

			this.maxSpeed = 200;
			this.currentSpeed = 40;
			this.currentGear = 'F';
			this.price = 1000;
		

		}

		
		public boolean isMoreExpensive(Car car) {

			if (car != null && !car.equals("")) {

				if (this.price > car.price) {
					return true;
				}

				return false;
			}

			else {
				System.out.println("Invalid car given!");
			}

			return false;
		}
		
		
		public double calculateCarPriceForScrap(double metalPrice) {

			if (metalPrice > 0) {
				double coef = 0.2;

				if (color != null) {
					if (this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("white")) {
						coef += 0.05;
					}
				}
				if (this.isSportCar) {
					coef -= 0.05;
				}

				double priceForScrap = metalPrice * coef;
				return priceForScrap;
			}
			return 0.0;
		}

		public void accelerate() {
			if (currentSpeed > maxSpeed) {
				System.out.println("The cannot accelerate more! ");
			} else {
				currentSpeed += 10;
			}
		}

		public void changeGearUp() {

			if (currentGear == gears[gears.length - 1]) {
				System.out.println("You cannot change the gear up! ");
			} else {
				for (int index = 0; index < gears.length; index++) {

					if (gears[index] == currentGear) {

						currentGear = gears[index + 1];

					} else {
						System.out.println("It doesn't exist such a gear here! ");
					}

				}
			}
		}

		public void changeGearDown() {

			if (currentGear == gears[0]) {
				System.out.println("You cannot change the gear down! ");
			}

			for (int index = 1; index < gears.length; index++) {

				if (gears[index] == currentGear) {
					currentGear = gears[index - 1];
				}

			}

		}


		void changeColor(String newColor) {
			
			if(newColor != null && newColor.length() > 3){
				this.color = newColor;
			}
			
		}
		
		void changeOwner(Person newOwner){
			
			if(newOwner != null){
				this.owner = newOwner;
			}
			
		}
		
		
		double sellCarForScrap(){
			
			return calculateCarPriceForScrap(price);
			
		}
		
		void setPrice(double price){
			if(price > 0){
				this.price = price;
			}		
		}
		
		

		
}
		

	

	
	

