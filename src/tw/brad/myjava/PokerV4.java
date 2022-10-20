package tw.brad.myjava;

import java.util.ArrayList;
import java.util.Collections;

public class PokerV4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0; i<52; i++) list.add(i);
		Collections.shuffle(list);
		for (Integer poker : list) {
			System.out.println(poker);
		}
	}

} //迴圈有三種 for(int )      do {}while  