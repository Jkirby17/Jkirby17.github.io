
public class Rectangle {
	double width;
	double height;
	
	Rectangle(){
		width = 1;
		height = 1;
	}
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;

	}
	double getArea() {
		return height * width;
	}
	double getPerimeter() {
		return 2 * width + 2 * height;
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
}
