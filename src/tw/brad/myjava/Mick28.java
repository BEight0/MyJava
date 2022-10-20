package tw.brad.myjava;

public class Mick28 {

	public static void main(String[] args) {
		Mick283 obj1 = new Mick283();
	}

}
class Mick281 extends Object{
	Mick281(){
		System.out.println("Mick281()");
	}
}
class Mick282 extends Mick281{
	Mick282(int a){
		System.out.println("Mick282()");
	}
}
class Mick283 extends Mick282{

	Mick283() {
		super(1);
		System.out.println("Mick283()");
	}
	
}