
public class Student {
	//멤버 변수
	String name;
	int age;
	String sex;
	String address;
	String phone;
	boolean isMarried;
	
	//생성자
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
	
	//메소드
	public void print()
	{
		System.out.println("이름 " + name);
		System.out.println("나이 " + age);
		System.out.println("성별 " + sex);
		System.out.println("주소 " + address);
		System.out.println("전화번호 " + phone);
		if(isMarried) {
			System.out.println("기혼");
		}
		else
			System.out.println("미혼");
	}
}
