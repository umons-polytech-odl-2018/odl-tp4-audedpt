package exercise3;

public class Square extends Rectangle{
	public Square(Point upperLeft, int sideLength){
		super(upperLeft, new Point(upperLeft.getX()+sideLength,
			upperLeft.getY()+sideLength));
	}
}
