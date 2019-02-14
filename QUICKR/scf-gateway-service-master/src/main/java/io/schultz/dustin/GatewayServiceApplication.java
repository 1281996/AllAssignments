package io.schultz.dustin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
*/
/*import io.schultz.dustin.filters.AddRequestHeaderFilter;
*/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
/* @Configuration */



public class GatewayServiceApplication {
	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	/*
	 * @Bean public AddRequestHeaderFilter addRequestHeaderFilter() { return new
	 * AddRequestHeaderFilter(); }
	 */
}
