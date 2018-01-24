package test;

public class Television implements RemoteControl, SerialCommunication{
	
	public void turnOn() {
		System.out.println("tv¸¦ ÄÒ´Ù");
	}
	public void turnOff() {
		System.out.println("tv¸¦ ²ö´Ù");
	}
	public void send(byte[] data) {
		System.out.println("tv¸¦ ÄÒ´Ù");
	}
	public byte[] receive() {
		return null;
	}

}
