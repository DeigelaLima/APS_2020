package repositories;

import java.util.HashMap;

import models.actors.Person;

public class PersonRepository {
	
	private HashMap<Integer, Person> repository;

	public PersonRepository() {
		this.repository = new HashMap<>();
	}
	
	public boolean add(Person person) {
		this.repository.put(person.getId(), person);
		return true;
	}
	
	public boolean remove(int id) {
		this.repository.remove(id);
		return true;
	}
	
	public Person get(int id) { //id return person
		return this.repository.get(id);
	}
}
