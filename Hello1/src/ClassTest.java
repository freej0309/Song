
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello MY name";
		
		//p.164
		System.out.println(str.charAt(1)); //x+1��° ���� ���
		System.out.println(str.compareTo ("Hellp MY name")); //�ٸ� ���� ��
		System.out.println(str.concat("World")); //Hello MY name �ڿ� ����� ����
		System.out.println(str.equals("olleh MY name")); //Hello�� ���ؼ� true/false
		System.out.println(str.equalsIgnoreCase("hello my name")); //��ҹ��� ���о��� ���ؼ� true/false
		System.out.println(str.isEmpty()); //���ڰ� �ƹ��͵� ������ true ������ false
		System.out.println(str.length()); //�� ���ڼ�
		System.out.println(str.replace(' ', '-')); //x�� y�� ��ȯ
		System.out.println(str.substring(5, 8)); //x��° ���ں��� y��° ���ڱ��� �ڸ�
		System.out.println(str.toLowerCase()); //��� �ҹ��ڷ� ����
		System.out.println(str.toUpperCase()); //��� �빮�ڷ� ����


		String date = "2017-01-17";
		//�� �Ʒ�ó�� ����
		String changeDate = "2017��01��17��";
		System.out.println(date.substring(0, 4));
		System.out.println(date.substring(0, 4));
		
	}

}
