
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		c.print();
		
		SUVCar suv = new SUVCar();
		suv.spd = 100;
		suv.gear = 7;
		suv.color = "black";
		suv.name = "super";
		suv.size = 10;
		suv.speedUp(200);
		suv.speedDown(30);
		suv.print();
		
	}

}
