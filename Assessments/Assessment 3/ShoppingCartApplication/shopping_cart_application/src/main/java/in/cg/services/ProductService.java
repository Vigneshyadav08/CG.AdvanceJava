package in.cg.services;

import org.springframework.stereotype.Service;
import in.cg.models.*;

@Service
public class ProductService {
		static Product p;
		public ProductService() {
			p = new Product();
			p.addProduct("Laptop",70000);
			p.addProduct("Mobile",40000);
			p.addProduct("Headphone",1500);
		}
		public double getProductTotalPrice(String productName,int qty)
		{
			return p.getPrice(productName) * qty;
		}
}
