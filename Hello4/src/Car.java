
public class Car { //모든 차의 공통부분

	int spd;
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment)
	{
		speed += increment;
	}
	public void speedDown(int decrement)
	{
		speed -= decrement;
	}
	
}


class SportsCar extends Car{ //Car를 상속받는다

	boolean turbo;
		
	public void setTurbo(boolean newValue) {
			turbo = newValue;
	}
	
	@Override
		public void speedUp(int increment) {
			speed = speed + (increment * 2);
		}
	@Override
		public void speedDown(int decrement) {
			speed = speed - (decrement * 2);
		}
	public void print() {
		System.out.println(speed);
		
	}
	
	
	
}

class SUVCar extends Car{
	
	String name;
	int size;
	
	public SUVCar()
	{
		
	}
	
	public SUVCar(int speed, int spd, int gear, String color, String name, int size)
	{
		this.spd = spd;
		this.speed = speed;
		this.gear = gear;
		this.color = color;
		this.name = name;
		this.size = size;
	}
	
	public void print() {
		System.out.println("속도는: " + spd);
		System.out.println(": " + speed);
		System.out.println("기어는: " + gear);
		System.out.println("색깔은: " + color);
		System.out.println("이름은: " + name);
		System.out.println("크기는: " + size);
		
	}
}
