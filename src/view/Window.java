package view;

import javax.swing.JFrame;

public abstract class Window extends JFrame{

	protected static JFrame frame;
	protected Layout layout;

	public Window() {
		super();
	}

	public static JFrame getInstance() {
		return frame;
	}

	public abstract void setUpLayout();

}
