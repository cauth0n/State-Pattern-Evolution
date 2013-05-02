package view;

import javax.swing.JFrame;

public abstract class Window extends JFrame {

	protected static JFrame frame;

	public Window() {

	}

	public static JFrame getInstance() {
		return frame;
	}

	public abstract void setLayout(Layout layout);

	public abstract Layout getLayout();

}
