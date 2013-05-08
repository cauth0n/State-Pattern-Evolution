package view;

import view.menus.MenuName;

public class DefaultMenu extends Menu {

	public DefaultMenu() {
		super();
		buildMenu();
	}

	@Override
	public void buildMenu() {
		buildFile();
		buildEdit();
	}

	public void buildFile() {
		this.add(new MenuName("File"));
	}

	public void buildEdit() {
		this.add(new MenuName("Edit"));
	}

}
