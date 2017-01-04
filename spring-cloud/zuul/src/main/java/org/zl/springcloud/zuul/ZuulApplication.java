/**
 * 
 * Create on 2016年12月26日
 */
package org.zl.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author Leo
 * @version 0.0.1
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	
	@Bean
	public LogFilter logFilter(){
		return new LogFilter();
	}
}
