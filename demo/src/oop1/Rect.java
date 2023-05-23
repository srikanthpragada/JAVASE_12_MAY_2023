package oop1;

public class Rect {
	private int length, width;

	public Rect(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		return this.length * this.width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
