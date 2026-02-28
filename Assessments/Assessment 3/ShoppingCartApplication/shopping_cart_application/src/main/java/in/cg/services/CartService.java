package in.cg.services;

import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	public double totalAmount(ProductService product,int laptopQty,int mobileQty,int headPhoneQty)
	{
		return product.getProductTotalPrice("Laptop",laptopQty)+product.getProductTotalPrice("Mobile",mobileQty)
		+product.getProductTotalPrice("Headphone", headPhoneQty);
	}
}
