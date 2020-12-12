package repositories;

import java.util.HashMap;

import models.actors.Person;
import models.products.Product;

public class ProductRepository {
	
	private HashMap<Integer, Product> repository;

	public ProductRepository() {
		this.repository = new HashMap<>();
	}
	
	public boolean add(Product product) {
		this.repository.put(product.getId(), product);
		return true;
	}
	
	public boolean remove(int id) {
		this.repository.remove(id);
		return true;
	}
	
	public Product get(int id) { //id return person
		return this.repository.get(id);
	}
}
