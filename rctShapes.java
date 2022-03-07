package ch3_4;

import java.util.Scanner;

public class rctShapes {
	
	shapeProperties[] shapes = new shapeProperties[100];
	int shapeNum = 0;
	
	public void mainCommand() {
		
		Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("$: ");
			 String cmd = sc.next();
			 if(cmd.equals("add")) {
				 String inputShape = sc.next();
				 
				 if(inputShape.equalsIgnoreCase("R")) {
					 double inputWidth = Double.parseDouble(sc.next());
					 double inputHeight = Double.parseDouble(sc.next());
					 
					 addRectangle(0, inputWidth, inputHeight);
					 
				 }else if(inputShape.equalsIgnoreCase("C")) {
					 double inputRadius = Double.parseDouble(sc.next());
					 
					 addCircle(inputRadius, 0, 0);
					 
				 }else if(inputShape.equalsIgnoreCase("T")) {
					 double inputWidth = Double.parseDouble(sc.next());
					 double inputHeight = Double.parseDouble(sc.next());
					 
					 addTriangle(0, inputWidth, inputHeight);
					 
				 }else {
					System.out.println("there's no shape..! type again..!"); 
				 }
			 }else if(cmd.equals("show")) {
				 show();
			 }else if(cmd.equals("showdetails")) {
				 showDetail();
			 }else if(cmd.equals("exit")) {
				 sc.close();
				 System.out.println("system exit..! bye..!");
				 System.exit(0);
			 }else if(cmd.equals("sort")){
				sorting(); 
			 }else {
				 System.out.println("wrong command...! try again...!");
			 }
		 }
		
	}
	
	public  void addRectangle(double r, double w, double h) {
		this.shapes[shapeNum] = new rectangle(r,w,h);
		this.shapeNum++;
	}
	
	public void addCircle(double r, double w, double h) {
		this.shapes[shapeNum] = new circle(r,w,h);
		this.shapeNum++;
		
	}
	
	public void addTriangle(double r, double w, double h) {
		this.shapes[shapeNum] = new triangle(r,w,h);
		this.shapeNum++;
	
	}
	
	public void show() {
		for(int i = 0; i < shapeNum; i++) {
			System.out.print((i+1) + ". ");
			this.shapes[i].toStringSimple();
		}
	}
	
	public void showDetail() {
		for(int i = 0; i < shapeNum; i++) {
			System.out.print(i+". ");
			this.shapes[i].toStringDetail();
		}
	}
	
	//create a function that make a list sorted by area descending.
	public void sorting() {
		System.out.println("==========================");
		System.out.println("before sorting");
		System.out.println("==========================");
		this.showDetail();
		
		for(int i = 0; i < shapeNum; i++ ) {
			for(int j = this.shapeNum -1; j > i; j--) {
				if(this.shapes[j].area > this.shapes[j-1].area) {
					shapeProperties tmp = this.shapes[j-1];
					this.shapes[j-1] = this.shapes[j];
					this.shapes[j] = tmp;	
				}
			}
		}
		
		System.out.println("==========================");
		System.out.println("after sorting");
		System.out.println("==========================");
		this.showDetail();
		
	}
	
	public static void main(String[] args) {
		
		rctShapes rcts = new rctShapes();
		rcts.mainCommand();
	}
	
	
	
}
