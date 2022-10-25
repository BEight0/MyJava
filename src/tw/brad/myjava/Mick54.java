package tw.brad.myjava;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Mick54 {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("dir1/file1.txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
		}

	}

}
