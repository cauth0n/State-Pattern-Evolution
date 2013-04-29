package patterns.state;

public class BookCover implements Book {

	@Override
	public void turnPage(Page number) {
		System.out.println(this.toString());
		number.setState(new BookTableOfContents());
	}

	@Override
	public String toString() {
		return "Book Cover";
	}

}
