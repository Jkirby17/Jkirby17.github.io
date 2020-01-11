/*
 * create a MyPoint class
 * create two points for the MyPoint class
 * UML
 * MyPoint
 * double x
 * double y
 * double distance
 * MyPoint()
 * 	MyPoint(double x, double y)
 * 	public double getX() 
 * 	public double getY() 
 * 	public double distance(MyPoint p) 
 * 	public double distance(double x2, double y2) 
*/

public class A10dot4 {

	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(0, 0);
		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.println("The distance between point " + point1.getX()+ " and " + point1.getY() 
		+ " and " + point2.getX()+ " and " + point2.getY() + " is: " + point1.distance(point2));

	}

}
