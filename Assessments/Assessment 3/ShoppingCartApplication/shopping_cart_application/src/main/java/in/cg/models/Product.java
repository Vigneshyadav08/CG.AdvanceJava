package in.cg.models;
import java.util.*;
import java.util.Map.Entry;

public class Product {
	private Map<String,Double> products = new LinkedHashMap<>();

	public Map<String, Double> getProducts() {
		return products;
	}

	public void addProduct(String name,double price) {
		products.put(name, price);
	}
	
	public double getPrice(String productName)
	{
		for(Entry<String,Double> product:products.entrySet())
		{
			if(product.getKey().equalsIgnoreCase(productName))
			{
				return product.getValue();
			}
		}
		return 0;		
	}
}
