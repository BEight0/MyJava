package tw.brad.myjava;

public class Mick14 {

	public static void main(String[] args) {
		int a=10, b=3;
		
	//	System.out.println(++a);
	//	System.out.println(a);
	//	System.out.println(b--);
	//	System.out.println(b);
        // ++ -- 擺前擺後決定先後加減
	if(++a > 10 || --b < 3) { //可以嘗試||=或 &&=和 跟前後+-
		System.out.printf("OK: a = %d, b = %d", a, b);
	}else {
		System.out.printf("XX: a = %d, b = %d", a, b);
	}
		}
	

}
