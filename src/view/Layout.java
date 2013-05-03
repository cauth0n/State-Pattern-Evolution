package view;

import java.awt.BorderLayout;
import java.awt.Container;

public abstract class Layout extends BorderLayout {
	protected Panel mainPanel;
	protected Menu menuBar;
	protected EvolutionScrollBar evolScroll;

	public abstract void setUpLayout(Container c);

}
