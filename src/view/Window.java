package view;

import javax.swing.JFrame;

public abstract class Window extends JFrame {

	protected Layout layout;

	public Window(String s) {
		super(s);
	}

	public abstract void setUpLayout();

}
