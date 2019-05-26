package com.evan.springcloud.service.impl;

import com.evan.springcloud.entity.Student;
import com.evan.springcloud.mapper.StudentMapper;
import com.evan.springcloud.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 *
 * @author evan
 * @date 2019-05-26 12:03
 * @description
 */
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper mapper;


	@Override
	public Student findOneById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void insertStudent(Student student) {
		 mapper.insert(student);
	}
}
