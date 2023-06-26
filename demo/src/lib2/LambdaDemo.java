package lib2;

class MyTask implements Runnable {
	public void run() {
		System.out.println("First Thead!");
	}
}

public class LambdaDemo {
	public static void main(String[] args) {
		var t1 = new Thread(new MyTask());
		t1.start();

		// Anonymous inner class
		var t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Second Thead!");
			}
		});
		t2.start();

		// Lambda Expression
		Runnable r = () -> System.out.println("Third Thread");
		System.out.println(r.getClass());
		var t3 = new Thread(r);
		t3.start();

		// Lambda Block
		var t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();

	}

}
