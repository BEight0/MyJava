package tw.brad.myclass;

import java.io.Serializable;

public class Bike extends Object implements Serializable{ //Object跟繼承完全沒有關係 只是編譯器在幫忙而已
	protected double speed;//速度不適用public 使用private封裝起來 protected保護起來 父子類別
													//稍微開放 繼承子類別 相同package可以使用
	public void upSpeed() {
		speed = speed< 1 ? 1 : speed*1.2;
		
	}
	public void downSpeed() {
		speed = speed< 1 ? 0 : speed*0.7;
		
	}
	public double getSpeed() {
		return speed;
		
	}
	public String toString() {
		return "Bike"+ speed;
	}
}
