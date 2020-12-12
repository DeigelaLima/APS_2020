package models.products;

public class Dvd extends Movie{
	
	private boolean scratched;

	public Dvd(int id, String title, String gender, boolean allocated, int releaseYear, int duration,
			boolean scratched) {
		super(id, title, gender, allocated, releaseYear, duration);
		this.scratched = scratched;
	}

	boolean isScratched() {
		return scratched;
	}
	void setScratched(boolean scratched) {
		this.scratched = scratched;
	}
}
