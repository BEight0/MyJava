package tw.brad.myjava;

public class Mick43 {

	public static void main(String[] args) {
		int a = 10,b = 0;
		int c;
		int[] d = {1,2,3,4};
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[4]);
//		}catch(RuntimeException re) {
//			System.out.println("XX3");
		}catch(ArrayIndexOutOfBoundsException ie) { //數值超出範圍
			System.out.println("XX2");		
		}catch (ArithmeticException ae) { //數學的例外
			System.out.println("XX");
		
		}		
		System.out.println("OK");
}
}