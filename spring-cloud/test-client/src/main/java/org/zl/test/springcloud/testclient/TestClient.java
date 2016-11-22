/**
 * 
 * Create on 2016年11月21日
 */
package org.zl.test.springcloud.testclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Leo
 * @version 0.0.1
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@RestController
public class TestClient {

	@Autowired
	RestTemplate restTemplate; 

	@RequestMapping("/")
    public String home() {
		String result = restTemplate.getForObject("http://cloud-test-service", String.class);
		//System.out.println(result);
		String result1 = "";//restTemplate.getForObject("http://scloud", String.class);
		return result+"\n"+result1;
    }
	
	@RequestMapping("/scloud")
    public String scloud() {
		String result1 = restTemplate.getForObject("http://scloud", String.class);
		return result1;
    }
	
	@RequestMapping("/ss")
    public String s2() {
		String result = restTemplate.getForObject("http://cloud-test-service", String.class);
		String result1 = restTemplate.getForObject("http://scloud", String.class);
		return result+"\n"+result1;
    }
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TestClient.class, args);
	}

}
