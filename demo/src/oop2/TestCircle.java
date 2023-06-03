package oop2;

import java.util.Arrays;

class Circle implements Comparable<Circle> {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.valueOf(this.radius);
	}

	@Override
	public int compareTo(Circle other) {
		return this.radius - other.radius;
	}
}

public class TestCircle {

	public static void main(String[] args) {
		Circle circles[] = { new Circle(10), new Circle(5), new Circle(30) };

		Arrays.sort(circles);

		for (var c : circles)
			System.out.println(c);

	}

}
