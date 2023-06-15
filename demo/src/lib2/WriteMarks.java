package lib2;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 var raf = new RandomAccessFile("d:\\classroom\\may12\\marks.dat", "rw");
		 
		 for(int i = 0; i < 20; i ++)
			 raf.writeInt( (int) (Math.random() * 100));
		 
		 raf.close();
		 
	}

}
