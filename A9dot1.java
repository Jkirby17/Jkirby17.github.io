/*
 * rectangle class 
 * 
 * contains two double data fields -width -height with default value=1
 * UML  for Rectangle 
 * 
 * Rectangle()
 * Rectangle(double width, double height)
 * double getArea()
 * double getPerimeter()
 * double getWidth()
 * double getHeight()
 * 
 * 
 */
public class A9dot1 {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		System.out.println("The width is: " + rectangle1.width + " height " +rectangle1.height
				+ " area " +rectangle1.getArea() + " perimeter " + rectangle1.getPerimeter() );
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The width of the rectangle is: " + rectangle2.getWidth() );
		System.out.println("The height of the rectangle is: " + rectangle2.getHeight() );
		System.out.println("The area of the rectangle is: " + rectangle2.getArea() );
		System.out.println("The perimeter of the rectangle is: " + rectangle2.getPerimeter() );


		
		


		}
	}