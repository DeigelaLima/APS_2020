package models.actors;

public class Employee extends Person {
	
	private String login;
	private String password;
	
	public Employee(int id, String name, String login, String password) {
		super(id, name);
		this.login = login;
		this.password = password;
	}
	
	String getLogin() {
		return login;
	}
	void setLogin(String login) {
		this.login = login;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
}
