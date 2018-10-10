package com.minivision.openplatform.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

/**
 * <Description> zipkin的入口类 <br>
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年10月09日 <br>
 */

@EnableZipkinStreamServer
@SpringBootApplication
public class App {

	/**
	 * Description: 启动函数 <br>
	 * @author caixing<br>
	 * @taskId <br>
	 *
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
