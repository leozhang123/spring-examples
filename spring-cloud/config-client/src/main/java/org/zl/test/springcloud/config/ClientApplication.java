/**
 * 
 * Create on 2016年11月17日
 */
package org.zl.test.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 * @version 0.0.1
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ClientApplication {

	@Value("${my.message:World}")
	  String name;

	
	@RequestMapping("/")
    public String home() {
		return "Hello " + name;
    }

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
