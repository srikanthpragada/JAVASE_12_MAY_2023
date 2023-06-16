package lib2;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		var f = new File("d:\\classroom\\may12");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());

	}

}
