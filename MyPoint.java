
public class MyPoint {
	private double x;
	private double y;
	
	private double distance;

	MyPoint(){
		
	}
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double distance(MyPoint p) {
		distance = Math.sqrt((x - p.getX())*(x - p.getX()) + (y - p.getY())*(y - p.getY()));
		return distance;
	}
	public double distance(double x2, double y2) {
		distance = Math.sqrt((x2 - x)*(x2 - x) + (y2 - y)*(y2 - y));
		return distance;
	}
}
