import business.concretes.ProductManager;
import core.concretes.LoggerManagerAdapter;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;
import jLogger.CodeFromNet;

public class Test {
	public static void main(String[] args) {
		Product product1 = new Product(1, 1, "Kalem", 15.6, 1502);
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), new LoggerManagerAdapter());
		productManager.Add(product1);
	}

}
