package ch3_4;

public class circle extends shapeProperties{

	public circle(double r, double w, double h) {
		
		super(r,0,0); //initialize p
		this.area = calArea();
		this.perimeter = calPerimeter();
				
	}
	
	public double calArea() {
		return this.radius * this.radius * Math.PI;
	};
	
	public double calPerimeter() {
		return 2*(this.radius * Math.PI);
	};

	public void toStringSimple() {
		System.out.println("circle: radius is " + this.radius);
	}
	
	public void toStringDetail() {
		System.out.println("circle: radius is " + this.radius);
		System.out.println("\t - The area is " + this.area);
		System.out.println("\t - The perimeter is " + this.perimeter);

	}
	
}
