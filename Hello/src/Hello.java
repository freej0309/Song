public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Car car = new Car();
	car.print();
	
	Car myCar = new Car("blue");
	myCar.print();
	
	Car yourCar = new Car("yellow", 2);
	yourCar.print();
	
	Car ourCar = new Car("black", 3, 5);
	ourCar.print();
	}
}