/**
 * 
 * Create on 2016年11月21日
 */
package org.zl.test.springcloud.testservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 * @version 0.0.1
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class TestService {

	@Value("${my.name:World}")
	  String name;
	
	@RequestMapping("/")
    public String home() {
		System.out.println("call service1");
		return "this my test service1.  wolcome " + name;
    }
	
	@RequestMapping("/say")
    public String say() {
		System.out.println("call service1");
		return "this my test service1.  say " + name;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestService.class, args);
	}

}
