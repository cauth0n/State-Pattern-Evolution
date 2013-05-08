package view;

import java.awt.Container;

public class DefaultBorderLayout extends Layout {

	public DefaultBorderLayout() {
		super();
		mainPanel = new ClassDiagramPanel();
		menuBar = new DefaultMenu();
		evolScroll = new DefaultEvolutionScrollBar();
	}

	public void setUpLayout(Container c) {
		c.add(mainPanel, CENTER);
		c.add(menuBar, NORTH);
		c.add(evolScroll, SOUTH);
	}

}
