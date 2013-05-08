package view;

import javax.swing.JFrame;

public class DefaultWindow extends Window {

	private final static String windowName = "Practice GUI";

	public DefaultWindow() {
		super(windowName);
		this.setSize(600, 600);
		this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setUpLayout();
	}

	@Override
	public void setUpLayout() {
		layout = new DefaultBorderLayout();
		layout.setUpLayout(this);
	}

}
