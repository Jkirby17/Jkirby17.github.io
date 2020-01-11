/*
 * UML
 * public class Triangle
extends GeometricObject{
	double side1 = 1;		
	double side2 = 1;	
	double side3 = 1;
	Triangle(){}
Triangle (double side1, double side2, double side3){
public double get1() {
public double get2() {
public double get3() {
public double getArea() {
public double getPerimeter() {
public String toString() {
 */
public class Triangle
extends GeometricObject{
	double side1 = 1;		
	double side2 = 1;	
	double side3 = 1;


Triangle(){
}

Triangle (double side1, double side2, double side3){
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}
public double get1() {
	return side1;
}
public double get2() {
	return side2;
}
public double get3() {
	return side3;
}

public double getArea() {
	double s = ((side1 + side2 +side3)/2);
	double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
	return area; 
}
public double getPerimeter() {
	return side1 +side2 +side3;
}
public String toString() {
	return "Triangle: side1 = " + side1+ " side2 = " + side2+ " side3 = " + side3; 
}
}