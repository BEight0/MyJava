package tw.brad.myjava;

import java.util.HashSet;
import java.util.TreeSet;

public class Mick39 {

	public static void main(String[] args) {
		TreeSet<Integer> lotters = new TreeSet<> ();  //Integer 半形
		lotters.add(12);  //如果byte(12)    byte -> int -> autoboxing -> Integer (XX
		while(lotters.size()<6) {
			lotters.add((int)(Math.random()*49+1));
		}
		System.out.println(lotters);
	}

}
