package com.minivision.openplatform.zipkin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

/**
 * <Description> zipkin的入口类 <br>
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年10月09日 <br>
 */

@EnableZipkinServer
@SpringBootApplication
@EnableApolloConfig
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

	@Bean
	public MySQLStorage mySQLStorage(DataSource datasource) {
		return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
	}

}
