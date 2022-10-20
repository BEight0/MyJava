package tw.brad.myjava;

public class Mick17 {

	public static void main(String[] args) {
		int i = 1;
		for (printMick(); i <= 7; printLine()) { //迴圈常用
			System.out.println(i++);
		}
		System.out.println("=>"+ i);
	}
	
	static void printMick() {
		System.out.println("Mick");
	}	
	static void printLine() {
		System.out.println("---------------");
	}
}