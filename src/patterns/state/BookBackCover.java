package patterns.state;

public class BookBackCover implements Book {

	@Override
	public void turnPage(Page number) {
		System.out.println(this.toString());
		
	}
	@Override
	public String toString(){
		return "Back Cover";
	}

}
