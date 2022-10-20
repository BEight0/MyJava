package tw.brad.myjava;

public class Mick29 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c = a;   //a = a+b //a=13  
		a = b;		//b = a-b //b=10	
		b = c;		//a = a-b //a=3
		
		System.out.printf("a=%d , b=%d",a,b);

	}
        
}
