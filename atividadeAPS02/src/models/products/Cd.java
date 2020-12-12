package models.products;

public class Cd extends Music{
	
	private boolean scratched;
	private boolean dual;
	
	public Cd(int id, String title, String gender, boolean allocated, String author, int tracksNumber,
			boolean scratched, boolean dual) {
		super(id, title, gender, allocated, author, tracksNumber);
		this.scratched = scratched;
		this.dual = dual;
	}

	boolean isScratched() {
		return scratched;
	}
	void setScratched(boolean scratched) {
		this.scratched = scratched;
	}
	boolean isDual() {
		return dual;
	}
	void setDual(boolean dual) {
		this.dual = dual;
	}
}
