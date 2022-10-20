package tw.brad.myjava;

public class Mick34 {
	public static void main(String[] args) {
		//Brad341 obj1 = new Brad341();
		Brad341 obj1 = new Brad342();
		Brad342 obj2 = new Brad342();
	}
}
abstract class Brad341 {
	void m1() {System.out.println("Brad341:m1()");}
	abstract void m2(int a); //abstract抽象的
	abstract public Object m3(Object a); //基本傳回型別的方法名稱要一模一樣
	abstract void m4();
}
class Brad342 extends Brad341{
	void m2(int b) {}
	void m2() {}
	public StringBuffer m3(Object a) {return null;}
	void m4() {}
}