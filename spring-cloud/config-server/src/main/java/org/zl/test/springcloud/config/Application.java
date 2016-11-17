/**
 * 
 * Create on 2016年11月16日
 */
package org.zl.test.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Leo
 * @version 0.0.1
 */
@SpringBootApplication
@EnableConfigServer
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
