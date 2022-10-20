package tw.brad.myjava;

import tw.brad.myclass.TWid;

public class Mick31 {

	public static void main(String[] args) {//math.random  static類別不需要物件
		
		TWid id1 = new TWid();
		System.out.printf("ID1: %s \n",id1.getId());
		
		TWid id2 = new TWid(false);
		System.out.printf("ID2: %s \n",id2.getId());
		
		TWid id3 = new TWid(4);
		System.out.printf("ID3: %s \n",id3.getId());
		
		TWid id4 = new TWid(true, 7);
		System.out.printf("ID4: %s \n",id4.getId());
		
		

	}

}
