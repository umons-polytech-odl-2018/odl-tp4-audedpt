package exercise3;

import java.io.Serializable;
import java.sql.Array;

public class ConvexPolygon implements Drawable, Serializable {
	private Point[] vertices;
	private double perimeter;
	private double area;
	public ConvexPolygon(Point[] vertices)
	{
		this.vertices = vertices;
	}

	public double computePerimeter() {
		int nmbVertices = vertices.length;
		for (int i =0; i < nmbVertices-1;i++){
			perimeter+= vertices[i].distanceTo(vertices[i+1]);
		}
		perimeter += vertices[nmbVertices-1].distanceTo(vertices[0]);
		return perimeter;
	}
	public Point[] getVertices() {return vertices;}

	public double computeArea() {
		int middlePointX = 0;
		for(int i=0; i<vertices.length;i++) { middlePointX += vertices[i].getX();}
		middlePointX/=vertices.length;
		int middlePointY = 0;
		for(int i=0; i<vertices.length;i++) { middlePointY += vertices[i].getX();}
		middlePointY/=vertices.length;
		//Point middlePoint= new Point(middlePointX,middlePointY);
		for (int i =0; i < vertices.length-1;i++){
			area += Math.abs(((vertices[i].getX()-middlePointX)*(vertices[i+1].getY()-middlePointY)-
				(vertices[i].getY()-middlePointY)*(vertices[i+1].getX()-middlePointX))/2);
			}
		area += Math.abs(((vertices[vertices.length-1].getX()-middlePointX)*(vertices[0].getY()-middlePointY)-
			(vertices[vertices.length-1].getY()-middlePointY)*(vertices[0].getX()-middlePointX))/2);
		return area;
	}

}
