package models.products;

public abstract class Movie extends Product{

	private int releaseYear;
	private int duration;
	
	public Movie(int id, String title, String gender, boolean allocated, int releaseYear, int duration) {
		super(id, title, gender, allocated);
		this.releaseYear = releaseYear;
		this.duration = duration;
	}

	int getReleaseYear() {
		return releaseYear;
	}

	void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	int getDuration() {
		return duration;
	}

	void setDuration(int duration) {
		this.duration = duration;
	}
}
