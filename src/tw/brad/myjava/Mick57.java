package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mick57 {

	public static void main(String[] args) {		
		try {
			ObjectInputStream oin =
					new ObjectInputStream(
							new FileInputStream("dir1/brad.score"));
			
			Object obj1 = oin.readObject();
			Student s1 = (Student)obj1;
			System.out.printf("%s:%d:%f", s1.getName(), s1.score(), s1.avg());
			
			Object obj2 = oin.readObject();
			Student s2 = (Student)obj1;
			System.out.printf("%s:%d:%f", s2.getName(), s2.score(), s2.avg());
				
			System.out.println("=>" + oin.available());
			
			oin.close();
			System.out.println("OK");			
		}catch (Exception e) {	
			System.out.println(e);
		}
	}

}
