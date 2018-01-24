
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello MY name";
		
		//p.164
		System.out.println(str.charAt(1)); //x+1번째 글자 출력
		System.out.println(str.compareTo ("Hellp MY name")); //다른 글자 비교
		System.out.println(str.concat("World")); //Hello MY name 뒤에 따라올 글자
		System.out.println(str.equals("olleh MY name")); //Hello와 비교해서 true/false
		System.out.println(str.equalsIgnoreCase("hello my name")); //대소문자 구분없이 비교해서 true/false
		System.out.println(str.isEmpty()); //글자가 아무것도 없으면 true 있으면 false
		System.out.println(str.length()); //총 글자수
		System.out.println(str.replace(' ', '-')); //x를 y로 변환
		System.out.println(str.substring(5, 8)); //x번째 글자부터 y번째 글자까지 자름
		System.out.println(str.toLowerCase()); //모두 소문자로 변경
		System.out.println(str.toUpperCase()); //모두 대문자로 변경


		String date = "2017-01-17";
		//을 아래처럼 변경
		String changeDate = "2017년01월17일";
		System.out.println(date.substring(0, 4));
		System.out.println(date.substring(0, 4));
		
	}

}
