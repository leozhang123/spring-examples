/**
 * 
 * Create on 2016年11月17日
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
public class ConfigServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("http.proxySet", "true");
		System.setProperty("http.proxyHost","10.22.98.21");
		System.setProperty("http.proxyPort", "8080");
		System.setProperty("https.proxyPort", "8080");
		System.setProperty("https.proxyHost", "10.22.98.21");
		SpringApplication.run(ConfigServer.class, args);
	}

}
