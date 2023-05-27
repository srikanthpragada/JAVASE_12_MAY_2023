package oop1;

abstract class Shape {
	private int x, y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public abstract long getArea();
		 
}

class Circle extends Shape {
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public void print() {
		super.print();
		System.out.println(this.r);
	}
	
	public long getArea() {
		return  Math.round(Math.PI * this.r * this.r);
	}
}

class Square extends Shape {
	private int s;

	public Square(int x, int y, int s) {
		super(x, y);
		this.s = s;
	}

	public void print() {
		super.print();
		System.out.println(this.s);
	}
	public long getArea() {
		return  this.s * this.s;
	}
}

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Circle(10, 20, 10);
		s.print();
		System.out.println(s.getArea());
		
		s = new Square(20, 20, 10);
		s.print();
		System.out.println(s.getArea());
	}
}
