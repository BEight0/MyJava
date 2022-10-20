package tw.brad.myjava;

public class Mick15 {

	public static void main(String[] args) {//if二分法 switch多支線
		int a = 30; //a是變數
		final int b = 3; //b是常數 final加上去就是最終數字=常數
		
		switch(a) { //byte,short,int,char,String,enum
		    case b:
		    	System.out.println("A");
		    	break; //敘述句 break脫離所在的程式區塊
		    case 10:
		    	System.out.println("B");
		    	//break;	
		    default: //default 初始化	
		    	System.out.println("X");
		    	//break;
		    case 100:
		    	System.out.println("C");
		    	//break;	
		    
		}
			System.out.println("End");
	}

}
