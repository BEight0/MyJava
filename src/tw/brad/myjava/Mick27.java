package tw.brad.myjava;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mick27 extends JFrame{ //Mick27就是JFrame //Mick27 Object is-a JFrame
	//Mick27 Object has-a b1, b2, b3
	private JButton b1, b2, b3;
	
	public Mick27() { //進行初始化 
		//super
		super("My Winfow");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
			
		setLayout(new FlowLayout());
		add(b1); add(b2); add(b3);
		
		setSize(600, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Mick27();

	}

}
