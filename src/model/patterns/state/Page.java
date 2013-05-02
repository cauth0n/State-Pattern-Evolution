package model.patterns.state;

public class Page {
	private Book currentState;

	public Page() {
		currentState = new BookCover();
	}

	public void setState(Book s) {
		currentState = s;
	}

	public void turnPage() {
		currentState.turnPage(this);
	}
}
