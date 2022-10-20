package tw.brad.myjava;

public class Mick99 {

	public static void main(String[] args) { // \t=空八格 換行的意思
	    final int ROWS = 3;//ROWS常數通常全大寫ROWS=常數 幾行
	    final int COLS = 3;                       //幾列
	    final int START = 2;                      //幾列
	    
		for (int k = 0; k<ROWS; k++) {
		for (int j = 1; j<=9; j++) {	//for (;;)連續執行
		for (int i=2; i<START+COLS; i++) {
			int newi = i + k * COLS;
			int r = newi * j; // i * 1
			System.out.printf("%d x %d = %d\t", newi, j, r);
		}
		System.out.println();
	  }
	  System.out.println("---");  
	  }

	}	
}