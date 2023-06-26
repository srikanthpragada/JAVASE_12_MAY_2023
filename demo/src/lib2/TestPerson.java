package lib2;

import java.util.TreeSet;

class Person  implements Comparable<Person>{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person p) {
			return p.name.equals(this.name) && p.age == this.age;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person other) {
		if ( this.name.equals(other.name))
			return  this.age - other.age;
		else
			return this.name.compareTo(other.name);
	}

}

public class TestPerson {

	public static void main(String[] args) {
		var persons = new TreeSet<Person>();

		persons.add(new Person("Andy", 30));
		persons.add(new Person("Kevin", 35));
		persons.add(new Person("Andy", 30));
		persons.add(new Person("Jason", 40));
		persons.add(new Person("Andy", 50));

		for (var p : persons) {
			//System.out.println(p.hashCode());
			System.out.println(p);
		}

	}

}
