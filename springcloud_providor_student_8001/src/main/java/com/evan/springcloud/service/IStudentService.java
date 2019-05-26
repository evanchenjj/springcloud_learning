package com.evan.springcloud.service;

import com.evan.springcloud.entity.Student;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 12:02
 * @description
 */
public interface IStudentService {
	Student findOneById(Integer id);


	void insertStudent(Student student);
}
