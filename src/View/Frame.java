package View;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	Drawing drawing = new Drawing();
	
	public Frame() {
		super("Tytu³");
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(width, height);
		int widthFrame = this.getSize().width;
		int heightFrame = this.getSize().height;
		
		this.setLocation((width - widthFrame)/2, (height - heightFrame)/2);
		this.add(drawing);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	public static void main(String[] args) {
		new Frame().setVisible(true);
	}
}
