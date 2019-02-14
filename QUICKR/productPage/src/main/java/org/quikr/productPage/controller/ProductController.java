package org.quikr.productPage.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.quikr.productPage.model.Product;
import org.quikr.productPage.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/homepage")
public class ProductController {

	@Autowired
	private Productservice ps;
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/products")

	public List<Product> getproducts() {
		System.out.println(port);
		return ps.getproducts();
	}

	@GetMapping("/product/{id}")
	public Optional<Product> getproduct(@PathVariable Long id) {
		return ps.getproduct(id);
	}

	@PostMapping("/products")
	public Product addproducts(@RequestBody Product product) {
		System.out.println(ps.addproducts(product));
		return ps.addproducts(product);
	}

	@PutMapping("/product")
	public Product updateproducts(@RequestBody Product product) {
		System.out.println(ps.updateproduct(product));
		return ps.updateproduct(product);
	}

	@DeleteMapping("/products")
	public boolean deleteproducts() {
		System.out.println(ps.deleteproducts());
		return ps.deleteproducts();
	}

	@DeleteMapping("/product/{id}")
	public boolean deleteproduct(@PathVariable Long id) {
		return ps.deleteproduct(id);
	}

}
