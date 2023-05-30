package lib1;

class Course {
	private String title;
	private int fee;

	public Course(String title, int fee) {
		super();
		this.title = title;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return this.title + " - " + this.fee;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Course other) {
			return this.title.equals(other.title);
		} else
			return false;
	}

}

public class TestCourse {

	public static void main(String[] args) {
		var c1 = new Course("Java", 10000);
		var c2 = new Course("AWS", 5000);
		var c3 = new Course("Java", 10000);

		System.out.println(c1.equals(c3));

		System.out.println(c1.equals("Java"));

		System.out.println(c1); // c1.toString()
		System.out.println(c1.toString());

	}
}
