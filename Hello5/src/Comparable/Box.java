package Comparable;


public class Box implements Comparable{
	private double volume = 0;
	public Box(double v) {
		volume = v;
	}
	public int compareTo(Object otherObject) {
		Box other = (Box) otherObject;
		if(this.volume < other.volume) return -1;
		//this - b1(100) other - b2(85.0)
		else if(this.volume > other.volume) return 1;
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if(b1.compareTo(b2) > 0)
			System.out.println("b1�� b2���� �� ũ��");
		else
			System.out.println("b1�� b2�� ���ų� �۴�");

	}

}
