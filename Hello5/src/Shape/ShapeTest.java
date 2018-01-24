package Shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec = new Rectangle();
		rec.draw();
		rec.print();
		
		Circle cir = new Circle();
		cir.draw();
		cir.print();
		
		rec.move(1, 1);
		
		cir.move(2, 2);
	}

}
