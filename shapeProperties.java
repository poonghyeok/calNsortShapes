package ch3_4;

//abstract class and methods 
interface calShape{
	public double calArea();
	public double calPerimeter();
}

public abstract class shapeProperties {
	
	public double radius;
	public double width;
	public double height;
	
	abstract double calArea();
	abstract double calPerimeter();
	abstract void toStringSimple();
	abstract void toStringDetail();
	
	public double area;
	public double perimeter;
	
	public shapeProperties(double r, double w, double h) {
		this.radius = r;
		this.width = w;
		this.height = h;
	}
	
	
}
