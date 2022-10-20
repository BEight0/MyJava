package tw.brad.myjava;

import tw.brad.myclass.Bike;

public class Mick32 {
	public static void main(String[] args) {
		Brad321 obj1 = new Brad321();
		Brad321 obj2 = new Brad321();
		Brad321 obj3 = obj1;
		if(obj1.equals(obj3)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println(obj1); //基本型別比值 物件型別比記憶體位子
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3); //源頭object裡equals的比較跟 == 完全一樣
		System.out.println("-----------");//但字串裡的有改過 StringBuffer有改寫
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");//""裡的兩個物件名稱一樣在記憶體的位置也是一樣的
		String s4 = new String("Brad");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println("-----------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s2));
		System.out.println("-----------");
		StringBuffer sb1 = new StringBuffer("Brad");
		StringBuffer sb2 = new StringBuffer("Brad");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println("---");
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println(sb1);
		
		
		
	}
}

class Brad321{
	
}
