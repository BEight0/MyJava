package tw.brad.myclass;

import java.awt.*; // *字號代表awt底下的所有東西

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	public MyDrawer() {
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.DARK_GRAY);  //g2d = 小畫家的筆  
		g2d.setStroke(new BasicStroke(3));
		
		g2d.drawLine(0, 0, 200, 100);
	}
}


