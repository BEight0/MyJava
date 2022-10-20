package tw.brad.myjava;

import tw.brad.myclass.Bike;
import tw.brad.myclass.Scooter;

public class Mick25 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
      //Brad b2 = new Brad(); 隨意打並不成立
		System.out.println(b1.getSpeed());
	  //Bike設計腳踏車 Mick25使用腳踏車 針對速度這個屬性的處理
		while (b1.getSpeed()<= 10) {
			b1.upSpeed();
		}
		System.out.println(b1.getSpeed());
		System.out.println("---");
		Scooter s1 = new Scooter(); //new在記憶體裡產生一個位置
		System.out.println(s1.getSpeed() + ":" + s1.getGear());
		s1.changeGear(2);
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
		
		s1.changeGear(s1.getGear()+1);
		s1.upSpeed(); s1.upSpeed();
		System.out.println(s1.getSpeed());
	}

}
