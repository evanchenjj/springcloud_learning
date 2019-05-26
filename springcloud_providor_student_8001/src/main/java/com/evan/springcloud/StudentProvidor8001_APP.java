package com.evan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 12:10
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class StudentProvidor8001_APP {

	public static void main(String[] args) {
		SpringApplication.run(StudentProvidor8001_APP.class,args);
	}
}
