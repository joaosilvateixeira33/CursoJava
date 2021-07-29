package entilites;

public class Rectangle {
	public double whidth;
	public double height;
	
	public double area() {
		return whidth * height;
	}
	
	public double perimetric() {
		return 2 * (whidth + height);
	}
	
	public double diagonal() {
		return Math.sqrt(whidth * whidth + height * height);
	}
}
