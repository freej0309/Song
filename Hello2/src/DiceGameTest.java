
import java.util.Scanner;

class DiceGame {

		int diceFace; //주사위 숫자
		int userGuess; //사용자가 추리하는 숫자
		
		//생성자 없음
		
		
		//메소드
		private void RollDice()
		{
			diceFace = (int)(Math.random() * 6) + 1; //(Math.random() * 6) = 0~5까지
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
				System.out.println("맞았습니다");
			else
				System.out.println("틀렸습니다");
		}
		public void startPlaying()
		{
			//사용자로 부터 숫자 하나 입력받아서 UserGuess에 저장
			userGuess = getUserInput("예상값을 입력하시오");
			//주사위를 돌린다
			RollDice();
			//두 숫자를 비교한다
			checkUserGuess();
			
			//RollDice();
			//userGuess = getUserInput("예상값을 입력하시오");
			//두개는 바뀌어도 상관없다
		}
}
		

public class DiceGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DiceGame game = new DiceGame();
		game.startPlaying();
	}

}
