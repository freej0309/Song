
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] studntArray = new Student[5];
		//��ü �ȸ��������
		
		for(int i=0; i<5; i++)
		{
			studntArray[i] = new Student();
			studntArray[i].age = i + 1;
			studntArray[i].name = "�۹ο�";
		}
		
		Student temp = studntArray[0];
		
		
		
	}

}
