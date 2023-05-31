package oop1;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Rect [length=" + length + ", width=" + width + "]";
	}

	@Override
	public int hashCode() {
		return length + width;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rect other)
			return length == other.length && width == other.width;
		else
			return false;
	}

}
