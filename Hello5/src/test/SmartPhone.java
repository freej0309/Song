package test;

public class SmartPhone extends Device implements RemoteControl, Print{
	
	public void showPrice()
	{
		System.out.println("ºñ½Î");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("¾È³çÇÏ¼¼¿ä");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("ÆùÀ» ÄÒ´Ù");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("ÆùÀ» ²ö´Ù");
	}

}
