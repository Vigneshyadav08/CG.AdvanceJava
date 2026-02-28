package in.cg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.cg.services.*;
import in.cg.models.*;

@Controller
public class CartController {
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("productList")
	public String product()
	{
		return "productList";
	}
	@GetMapping("cart")
	public String cart()
	{
		return "cart";
	}
	@PostMapping("addToCart")
	public String addToCart(@ModelAttribute Cart cart,Model m)
	{
		m.addAttribute("totalAmount",cartService.totalAmount(productService,cart.getLaptopQty(),cart.getMobileQty(), cart.getHeadPhoneQty()));
		m.addAttribute("laptopTotal",productService.getProductTotalPrice("laptop",cart.getLaptopQty()));
		m.addAttribute("mobileTotal",productService.getProductTotalPrice("mobile",cart.getMobileQty()));
		m.addAttribute("headPhoneTotal",productService.getProductTotalPrice("headphone",cart.getHeadPhoneQty()));
		return "cart";
	}
}
