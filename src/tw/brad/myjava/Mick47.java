package tw.brad.myjava;

import java.io.File;

public class Mick47 {

	public static void main(String[] args) {
		File f1 = new File("c:\\test\\dir1"); //一條/是跳脫字元
		if(f1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			f1.mkdir();
		}
		System.out.println("-----");
		File dir1 = new File("dir1"); //用一個.表示本路徑   dir1前的./可以省略
		//System.out.println(here.getAbsolutePath()); //路徑所在的地方
		if(dir1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
