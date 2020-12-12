package models.products;

public abstract class Product {
	
	private int id;
	private String title;
	private String gender;
	private boolean allocated;
	
	
	public Product(int id, String title, String gender, boolean allocated) {
		super();
		this.id = id;
		this.title = title;
		this.gender = gender;
		this.allocated = allocated;
	}

	public int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isAllocated() {
		return allocated;
	}
	public void setAllocated(boolean allocated) {
		this.allocated = allocated;
	}
}
