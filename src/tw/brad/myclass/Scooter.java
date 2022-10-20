package tw.brad.myclass; //物件方法  //物件導向透過方法改變屬性

public class Scooter extends Bike{ //extends延展 延伸 發揚光大腳踏車 //Scooter認Bike為副類別
	private int gear;				//Java裡所有的類別都一定有副類別
	private int color;
	
	public Scooter() { //建構式進行物件初始化
		this(2);
	}
	
	public Scooter(int color) { //建構式與產生物件實體沒有關係 //無傳回值 其名稱與主類別名字一樣為建構式
		this.color = color; 
	}//***java寫得出來的類別都一定有建構式***Java所有類別都有副類別***所有類別所產生的類別絕對是別的建構式呼叫出來的**
	
	public void upSpeed() {        //動詞或介係詞全小寫 屬性首字大寫
		speed = speed< 1 ? 1 : speed + speed*gear;
	}
	public void upSpeed(boolean isTurbo) { //voerload 呼叫布林值超載
		if(isTurbo) {
			speed = speed< 1 ? 1 : speed + speed*gear*1.2;
		}else {
			upSpeed();
		}
	}
	
	public void downSpeed() {
		speed = speed< 1 ? 0 : speed - speed*0.5;
	}
						
	public int changeGear(int gear) {
		if (gear >=0 && gear <=5) {
		this.gear = gear;
		}
		return this.gear;
	}
	public int getGear() {
		return gear;
	}
}
