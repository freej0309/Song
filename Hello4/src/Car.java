
public class Car { //��� ���� ����κ�

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


class SportsCar extends Car{ //Car�� ��ӹ޴´�

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
		System.out.println("�ӵ���: " + spd);
		System.out.println(": " + speed);
		System.out.println("����: " + gear);
		System.out.println("������: " + color);
		System.out.println("�̸���: " + name);
		System.out.println("ũ���: " + size);
		
	}
}
