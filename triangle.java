package ch3_4;

public class triangle extends shapeProperties{
	
	public triangle(double r, double w, double h) {
		
		super(0,w,h); //initialize p
		this.area = calArea();
		this.perimeter = calPerimeter();
				
	}
	public double triangleSide() {
		return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.height,2));
	}
	
	public double calArea() {
		return this.height * this.width / (2.0);
	};
	
	public double calPerimeter() {
		return (this.height + this.width + this.triangleSide());
	};

	public void toStringSimple() {
		System.out.println("Trinagle: width is " + this.width + " , " + "heigth is " + this.height);
	}
	
	public void toStringDetail() {
		System.out.println("Triangle: width is " + this.width + " , " + "heigth is " + this.height);
		System.out.println("\t - The area is " + this.area);
		System.out.println("\t - The perimeter is " + this.perimeter);

	}

}
