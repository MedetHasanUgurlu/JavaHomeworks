package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	 public ProductManager(ProductDao productDao,LoggerService loggerService) {
		// TODO Auto-generated constructor stub
		 this.productDao = productDao;
		 this.loggerService = loggerService;
	}
	@Override
	public void Add(Product product) {
		// TODO Auto-generated method stub
		productDao.add(product);
		loggerService.logToSystem("");
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
