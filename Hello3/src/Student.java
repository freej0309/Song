
public class Student {
	//멤버 변수
	private String name;
	private int age;
	private String sex;
	private String address;
	private String phone;
	private boolean isMarried;
	
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
