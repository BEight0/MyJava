package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Mick49 {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
		     fin = new FileInputStream("dir1/file1.txt");
		     int len; byte[] buf = new byte[3]; 
		     while ( (len = fin.read(buf)) != -1) { //先給值在做比對的動作
		    	 System.out.print(new String(buf, 0, len));
		     }
		     	     
		     fin.close();
		     System.out.println("OK");
		}catch(Exception fe) {
			 System.out.println("XX");
//		}catch(FileNotFoundException fe) {
//			System.out.println("XX2");	     
//		}catch(IOException fe) {
//			System.out.println("XX");	
		}
	}
}