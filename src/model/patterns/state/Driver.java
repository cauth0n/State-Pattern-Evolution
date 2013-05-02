package model.patterns.state;

public class Driver {

	private Page page;

	// public static void main(String[] args) {
	// new Driver();
	// }

	public Driver() {
		page = new Page();
		readPages(10);
	}

	public void readPages(int numPages) {
		int currentPage = 0;
		while (currentPage < numPages) {
			page.turnPage();
			currentPage++;
		}

	}

}
