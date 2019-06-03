package com.evan.springcloud.controller;

import com.evan.springcloud.entity.Student;
import com.evan.springcloud.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 12:13
 * @description
 */
@Controller
public class StudentController {
	@Autowired
	private IStudentService studentService;

	@GetMapping(path = "/student/{id}",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Student findOneStudent(@PathVariable("id") Integer id){
		return studentService.findOneById(id);
	}

}
