package oop1;

class Employee {
	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.salary);
	}
}

class Manager extends Employee {
	protected int hra;

	public Manager(String name, int salary, int hra) {
		super(name, salary);
		this.hra = hra;
	}
	// Overriding 
	@Override 
	public void print() {
		super.print();
		System.out.println(this.hra);
	}
	@Override 
	public int getSalary() {
	    return this.salary + this.hra;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		 Manager m = new Manager("Scott", 100000, 30000);
		 m.print();
	}

}
