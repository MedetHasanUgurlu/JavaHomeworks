package dataAccess.abstracts;

import entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	Product[] getAll();
}
