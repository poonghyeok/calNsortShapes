package ch3_4;

public class rectangle extends shapeProperties {
	
	public rectangle(double r, double w, double h) {
		
		super(0,w,h); //initialize p
		this.area = calArea();
		this.perimeter = calPerimeter();
				
	}
	
	public double calArea() {
		return this.height * this.width;
	};
	
	public double calPerimeter() {
		return 2*(this.height + this.width);
	};
	
	public void toStringSimple() {
		System.out.println("Rectangle : width is " + this.width + " , " + "heigth is " + this.height);
	}
	
	public void toStringDetail() {
		System.out.println("Rectangle : width is " + this.width + " , " + "heigth is " + this.height);
		System.out.println("\t - The area is " + this.area);
		System.out.println("\t - The perimeter is " + this.perimeter);

	}
	
}
