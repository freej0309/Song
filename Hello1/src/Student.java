
public class Student {
	//��� ����
	String name;
	int age;
	String sex;
	String address;
	String phone;
	boolean isMarried;
	
	//������
	public Student()
	{
	
	}
	public Student(String name, int age, String sex, String address, String phone, boolean isMarried)
	{
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.address = address;
			this.phone = phone;
			this.isMarried = isMarried;
	}
	
	//�޼ҵ�
	public void print()
	{
		System.out.println("�̸� " + name);
		System.out.println("���� " + age);
		System.out.println("���� " + sex);
		System.out.println("�ּ� " + address);
		System.out.println("��ȭ��ȣ " + phone);
		if(isMarried) {
			System.out.println("��ȥ");
		}
		else
			System.out.println("��ȥ");
	}
}
