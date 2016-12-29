package CarTask;

public class CarShopDemo {

	public static void main(String[] args) {

		CarShop cars = new CarShop(4);
		Car audi = new Car("Audi", true, "red");
		Car opel = new Car("Opel Astra", false, "yellow");
		audi.setPrice(1500);
		Person gosheto = new Person();
		gosheto.setMoney(2000);
		cars.cars[0] = audi;
		cars.cars[1] = opel;
		gosheto.buyCar(audi);
		System.out.println(gosheto.car.model);
		
		
	}

}
