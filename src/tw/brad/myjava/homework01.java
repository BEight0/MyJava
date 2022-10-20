package tw.brad.myjava;

public class homework01 {

	public static void main(String[] args) {
		// 檢查質數
		int j, i;
		int k = 0;
		for(i=2; i<=100; i++) {
			for(j=2; j<=i; j++) {
				if(i%j == 0) {
					break;
				}
			}
			if(j>i) {
				k++;
				System.out.print(i+"\t");
			}
			if(k>=5) {
				System.out.println();
				k = 0;
			}
		}
		
	}
}