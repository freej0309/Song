package test;

public class Television implements RemoteControl, SerialCommunication{
	
	public void turnOn() {
		System.out.println("tv�� �Ҵ�");
	}
	public void turnOff() {
		System.out.println("tv�� ����");
	}
	public void send(byte[] data) {
		System.out.println("tv�� �Ҵ�");
	}
	public byte[] receive() {
		return null;
	}

}
