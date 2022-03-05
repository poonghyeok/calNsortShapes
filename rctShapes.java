package ch3_4;

import java.util.Scanner;

public class rctShapes {
	
	public static shapeProperties[] shapes = new shapeProperties[100];
	public static int shapeNum = 0;
	public static void main(String[] args) {
		
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
			 }
		 }
		
	}
	
	public static void addRectangle(double r, double w, double h) {
		shapes[shapeNum] = new rectangle(r,w,h);
		shapeNum++;
	}
	
	public static void addCircle(double r, double w, double h) {
		shapes[shapeNum] = new circle(r,w,h);
		shapeNum++;
		
	}
	
	public static void addTriangle(double r, double w, double h) {
		shapes[shapeNum] = new triangle(r,w,h);
		shapeNum++;
	
	}
	
	public static void show() {
		for(int i = 0; i < shapeNum; i++) {
			System.out.print((i+1) + ". ");
			shapes[i].toStringSimple();
		}
	}
	
	public static void showDetail() {
		for(int i = 0; i < shapeNum; i++) {
			System.out.print(i+". ");
			shapes[i].toStringDetail();
		}
	}
	
}
