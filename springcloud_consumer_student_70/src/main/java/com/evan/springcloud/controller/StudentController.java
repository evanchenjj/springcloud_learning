package com.evan.springcloud.controller;

import com.evan.springcloud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 13:15
 * @description
 */
@Controller
public class StudentController {

	private static final String REST_REQUEST_PREFIX="http://localhost:8001";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumer/student/{id}")
	@ResponseBody
	public Student findOneStudent(@PathVariable("id") Integer id){
		return restTemplate.getForObject(REST_REQUEST_PREFIX+"/student/"+id, Student.class);
	}

}
