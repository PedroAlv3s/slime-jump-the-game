package game.controller;

import javax.swing.JFrame;

public class Container extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 860;
	private static final int HEIGHT = 480;
	
	public Container() {
		setTitle("Slime Jump");
		setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Container container = new Container();
	}
}