package test;

public class SmartPhone extends Device implements RemoteControl, Print{
	
	public void showPrice()
	{
		System.out.println("���");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("���� �Ҵ�");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
	}

}
