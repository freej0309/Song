
class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time()
	{
		this(0, 0, 0);
	}
	public Time(int h, int m, int s)
	{
		setTime(h, m, s);
	}
	
	public void setTime(int h, int m, int s)
	{
		hour = ((h >= 0 && h < 24) ? h :0);
		//?앞이 참이면 h 거짓이면 0
		//if(h>=0 && h<24)
		//		{
		//		h	
		//		}
		//		else
		//			0
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
		//%02d = 2자리 정수
	}
}
public class TimeTest{
	public static void main(String args[]) {
		
		Time time = new Time();
		//디폴트 생성자
		
		System.out.print("기본 생성자 호출 후 시간: ");
		System.out.println(time.toString());
		
		Time time2 = new Time(13, 27, 6);
		System.out.print("두번째 생성자 호출 후 시간: ");
		System.out.println(time2.toString());
		
		Time time3 = new Time(99, 66, 77);
		System.out.print("올바르지 않은 시간 설정 후 시간: ");
		System.out.println(time3.toString());
	}

}
