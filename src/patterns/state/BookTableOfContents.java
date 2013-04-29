package patterns.state;

public class BookTableOfContents implements Book {

	@Override
	public void turnPage(Page number) {
		System.out.println(this.toString());
		number.setState(new BookEnding());

	}

	@Override
	public String toString() {
		return "Table of Contents";
	}
}
