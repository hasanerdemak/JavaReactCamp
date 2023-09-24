// Day 5
package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//TODO: Burada new'ler tamamen mecbur oldugumuz icin. Ancak new'lemedigimiz, bizim yerimize new'leyen sistemler var(Spring IoC gibi). Spring IoC ile cozulecek.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
