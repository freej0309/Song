
import java.util.Scanner;

class DiceGame {

		int diceFace; //�ֻ��� ����
		int userGuess; //����ڰ� �߸��ϴ� ����
		
		//������ ����
		
		
		//�޼ҵ�
		private void RollDice()
		{
			diceFace = (int)(Math.random() * 6) + 1; //(Math.random() * 6) = 0~5����
		}
		private int getUserInput(String prompt)
		{
			System.out.println(prompt);
			Scanner s = new Scanner(System.in);
			return s.nextInt();
		}
		private void checkUserGuess()
		{
			if(diceFace==userGuess)
				System.out.println("�¾ҽ��ϴ�");
			else
				System.out.println("Ʋ�Ƚ��ϴ�");
		}
		public void startPlaying()
		{
			//����ڷ� ���� ���� �ϳ� �Է¹޾Ƽ� UserGuess�� ����
			userGuess = getUserInput("������ �Է��Ͻÿ�");
			//�ֻ����� ������
			RollDice();
			//�� ���ڸ� ���Ѵ�
			checkUserGuess();
			
			//RollDice();
			//userGuess = getUserInput("������ �Է��Ͻÿ�");
			//�ΰ��� �ٲ� �������
		}
}
		

public class DiceGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DiceGame game = new DiceGame();
		game.startPlaying();
	}

}
