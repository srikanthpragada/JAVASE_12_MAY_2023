package oop1;

class Student {
	private String name;
	private int course, feePaid;

	public Student(String name, int course, int feePaid) {
		super();
		this.name = name;
		this.course = course;
		this.feePaid = feePaid;
	}

	public Student(String name, int course) {
		this(name, course, 0);
	}

	public Student(String name) {
		this(name, 1, 0);
	}

	public void payment(int amount) {
		this.feePaid += amount;
	}

	public int getFee() {
		return this.course == 1 ? 10000 : 20000;
	}

	public int getDue() {
		return this.getFee() - this.feePaid;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		var s = new Student("Jack", 2, 10000);
		System.out.println(s.getDue());

	}

}
