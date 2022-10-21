package tw.brad.myjava;

public class Mick41 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		Integer c = a + b;  //c是物件 a+b是int
		System.out.println(c.intValue());
		int d = c - b; //將c的int解封 拿出來做unboxing的動作 宣告是什麼就是什麼 此時此刻作為數值來運算
		System.out.println(d);
	}

}
