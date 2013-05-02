package view;

import javax.swing.JMenuBar;

public class DefaultMenu extends JMenuBar {

	private String[] menuOptions;

	public DefaultMenu(String[] menuOptions) {
		super();
		this.menuOptions = menuOptions;
	}

	public void initMenu() {
		for (String s : menuOptions) {
			this.add(new MenuItem(s));
		}
	}

}
