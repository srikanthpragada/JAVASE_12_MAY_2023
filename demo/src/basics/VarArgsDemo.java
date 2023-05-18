package basics;

public class VarArgsDemo {

	static void print(int c, int ... values) {
		for(int v : values)
			System.out.println(v);
	}

	public static void main(String[] args) {
		  print(10,20,30,40);
		  print(10,20);
	}

}
