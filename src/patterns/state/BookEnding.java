package patterns.state;

public class BookEnding implements Book {

	@Override
	public void turnPage(Page number) {
		System.out.println(this.toString());
		number.setState(new BookBackCover());
	}

	@Override
	public String toString() {
		return "Ending";

	}

}
