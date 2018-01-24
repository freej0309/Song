
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentManager manager = new StudentManager();
		
		for(int i = 0; i < 5; i++)
		{
			manager.addStudent();
		}
		
		manager.findAndPrint("±èµÎÇÑ");
		
		manager.printAll();
	}

}
