package tw.brad.myjava;

import java.util.LinkedList;

public class Mick40 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(); //LinkedList<>(); 有重複性但順序性才是重點
		list.add(0, "A");
		list.add(0, "B");
		list.add(0, "C");
		list.add(0, "D");
		list.add(0, "E");
		for (String v : list) {
			System.out.println(v);
		}
	
			
		
	}
}
