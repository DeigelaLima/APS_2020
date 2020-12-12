package models.products;

import java.util.ArrayList;

public class Bluray extends Movie{
	
	private ArrayList<String> languages;

	public Bluray(int id, String title, String gender, boolean allocated, int releaseYear, int duration,
			ArrayList<String> languages) {
		super(id, title, gender, allocated, releaseYear, duration);
		this.languages = languages;
	}

	ArrayList<String> getLanguages() {
		return languages;
	}
	void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
}
