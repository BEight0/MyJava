package tw.brad.myclass;

public class TWid {  
 	private String id;
 	private static String letters = "ABCDEFGHJKLMNPQRSTUVWXYWZIO";
 	      //static不需要物件 但有物件也可以呼叫
	public TWid() {//overload字串建構式 
		this((int)(Math.random()*2) == 0); //this第一道敘述句可以不用 super 
	}
	
	public TWid(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}
 	
	public TWid(int area) {
		this((int)(Math.random()*2 ) == 0 ,area);
	}
	
	public TWid(boolean isMale, int area) {
		StringBuffer sb = new StringBuffer();
		sb.append(letters.substring(area, area + 1))
			.append(isMale?"1":"2")
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10));
		String temp = sb.toString();
		for(int i = 0; i<10; i++) {
			if(isValidTWid(temp + i)) {
				id = temp + i;
			}
		}
	}
	
	public String getId() {
		return id;
		
	}
	public boolean isMale() {
		return true;
	}
		
	private TWid(String id) {
		this .id = id;
	}
	
	public static TWid crateTWid(String id) {
		TWid temp = null;
		if(isValidTWid(id)) {
	    
		}
		return temp;
	}
	
	public static boolean isValidTWid(String id) {
		boolean ret = false;
		
		if(id.matches("[A-Z][1289][0-9]{8}")){
			  //身分證  
			letters = "ABCDEFGHJKLMNPQRSTUVWXYWZIO";
			char c1 = id.charAt(0);
			int pos = letters.indexOf(c1); //0-25
			int n12 = pos + 10; //10-35
			
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			//----------------
			String s3 = id.substring(1,2); //字串的轉換 //物件導向自動封裝功能 //Integer
			int n3 = Integer.parseInt(s3);
			
			int n4 = Integer.parseInt(id.substring(2,3));
			int n5 = Integer.parseInt(id.substring(3,4));
			int n6 = Integer.parseInt(id.substring(4,5));
			int n7 = Integer.parseInt(id.substring(5,6));
			int n8 = Integer.parseInt(id.substring(6,7));
			int n9 = Integer.parseInt(id.substring(7,8));
			int n10 = Integer.parseInt(id.substring(8,9));
			int n11 = Integer.parseInt(id.substring(9,10));  //字串功能的應用
			//----------------
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5
					+ n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			ret = sum % 10 == 0;
			
			
		}
		//if(id.length() == 10) {  方法二
		//	char c1 = id.charAt(0);
		//  String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//  if(letter.indexOf(c1) >= 0) {
			
//		}		
		//	if(Character.isLetter(c1)) {
		//		String c2nds = "1289";
		//		String c2nd = id.substring(1,2);
		//		if(c2nds.contains(c2nd)) {
		//		}
		//		 if(Character.isLetter(c1)) {
		//		String c2nds = "0-9";
		//		String c2nd = id.substring(2,3);
					
		//			
		//		}
		//	}
		//}
		return ret;	
		
	}

}