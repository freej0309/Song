
public class Car {

	private String color;
	private int speed;
	private int gear;
	
	public Car()
	{
		color = "red";
		speed = 1;
		gear = 2;	
	}
	public Car(String col)
	{
		color = col;
		speed = 2;
		gear = 3;
	}
	public Car(String col, int a)
	{
		color = col;
		speed = a;
		gear = 3;
	}
	public Car(String col, int a, int b)
	{
		color = col;
		speed = a;
		gear = b;
	}
	void print()
	{
	System.out.println(color + "," + speed + "," + gear);
	}
}