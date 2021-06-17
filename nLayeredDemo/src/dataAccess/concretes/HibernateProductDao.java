package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Product is added by Hibernate");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
