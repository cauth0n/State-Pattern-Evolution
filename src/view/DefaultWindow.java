package view;

import javax.swing.JFrame;

public class DefaultWindow extends Window {

	public DefaultWindow() {
		frame = new JFrame("Practice GUI");
		frame.setSize(1280, 960);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void setLayout(Layout layout) {
		frame.setLayout(layout);

	}
	
	public Layout getLayout(){
		return new DefaultBorderLayout();
	}

}
