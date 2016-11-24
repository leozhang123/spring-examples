/**
 * 
 * Create on 2016年11月18日
 */
package org.zl.test.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Leo
 * @version 0.0.1
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
		SpringApplication.run(EurekaServer.class, args);
	}

}
