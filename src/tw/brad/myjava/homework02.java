package tw.brad.myjava;

public class homework02 {
public static void main(String[] args) {
	int k=0;
	for (int i=2; i<100; i++) {
		if(isPrime (i) ) {
			k++;
			System. out . print(i+"\t");
		}
		if (k >= 6 ) {

			System . out . print ("\n") ;
			k=0;
		}
	}
}
		private static boolean isPrime(int i) {
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					return false;
}

				return true;

	}
			return false;
			
}
}
