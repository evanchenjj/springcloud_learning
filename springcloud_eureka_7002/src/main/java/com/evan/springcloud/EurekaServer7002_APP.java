package com.evan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 15:56
 * @description
 */
@SpringBootApplication
@EnableEurekaServer //eureka server端启动类，接受其他服务注册进来
public class EurekaServer7002_APP {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_APP.class,args);
	}
}
