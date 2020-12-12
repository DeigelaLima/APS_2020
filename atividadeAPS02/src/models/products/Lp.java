package models.products;

public class Lp extends Music{
	
	private boolean rare;

	public Lp(int id, String title, String gender, boolean allocated, String author, int tracksNumber, boolean rare) {
		super(id, title, gender, allocated, author, tracksNumber);
		this.rare = rare;
	}

	boolean isRare() {
		return rare;
	}
	void setRare(boolean rare) {
		this.rare = rare;
	}
}
