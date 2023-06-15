package lib2;

import java.io.RandomAccessFile;

public class GetMarks {

	public static void main(String[] args) throws Exception {
		 var raf = new RandomAccessFile("d:\\classroom\\may12\\marks.dat", "r");
		 int rollno = 15; 
		 
		 int pos = (rollno - 1) * 4;
		 raf.seek(pos);  
		 System.out.println( raf.readInt());
		 
		 raf.close();
		 
	}

}
