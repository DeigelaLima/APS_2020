package models.products;

public class Vhs extends Movie{
	
	private boolean colored;

	public Vhs(int id, String title, String gender, boolean allocated, int releaseYear, int duration, boolean colored) {
		super(id, title, gender, allocated, releaseYear, duration);
		this.colored = colored;
	}

	boolean isColored() {
		return colored;
	}
	void setColored(boolean colored) {
		this.colored = colored;
	}
}
