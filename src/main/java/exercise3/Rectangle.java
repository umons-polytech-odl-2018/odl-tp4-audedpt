package exercise3;

public class Rectangle extends ConvexPolygon {
	public Rectangle(Point upperLeft, Point lowerRight){
		//vertices = new Point[4];
		super(new Point[]{
			upperLeft,
			new Point(lowerRight.getX(),upperLeft.getY()),
			lowerRight,
			new Point(upperLeft.getY(),lowerRight.getY())});

	}
}
