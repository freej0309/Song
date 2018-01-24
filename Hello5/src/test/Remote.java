package test;

public class Remote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone samsung = new SmartPhone();
		samsung.showPrice();
		samsung.print();
		samsung.turnOn();
		samsung.turnOff();
		
		Television LG = new Television();
		LG.turnOn();
		LG.turnOff();
		LG.send(null);
		LG.receive();
	}

}
