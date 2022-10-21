package tw.brad.myclass;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	public MyDrawer() {
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(g instanceof Graphics) {
			System.out.println("OK");
		}else {
		System.out.println("XX");
}
	}
}


