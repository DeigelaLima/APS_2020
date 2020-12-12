package models.products;

public abstract class Music extends Product{
	
	private String author;
	private int tracksNumber;
	
	public Music(int id, String title, String gender, boolean allocated, String author, int tracksNumber) {
		super(id, title, gender, allocated);
		this.author = author;
		this.tracksNumber = tracksNumber;
	}

	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	int getTracksNumber() {
		return tracksNumber;
	}
	void setTracksNumber(int tracksNumber) {
		this.tracksNumber = tracksNumber;
	}
}
