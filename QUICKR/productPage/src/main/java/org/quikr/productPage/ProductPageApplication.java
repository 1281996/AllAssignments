package org.quikr.productPage;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@EnableDiscoveryClient

@RestController
public class ProductPageApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ProductPageApplication.class, args);
	}

}

