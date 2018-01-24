
public class Student {
	//��� ����
	private String name;
	private int age;
	private String sex;
	private String address;
	private String phone;
	private boolean isMarried;
	
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
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
