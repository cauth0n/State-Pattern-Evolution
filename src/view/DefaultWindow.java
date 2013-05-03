package view;

import javax.swing.JFrame;

public class DefaultWindow extends Window {

	public DefaultWindow() {
		super("Practice GUI");
		frame = new JFrame("Practice GUI");
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
