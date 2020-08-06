package com.jen.service.impl;

import com.jen.entity.Student;
import com.jen.mapper.StudentMapper;
import com.jen.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentMapper studentMapper;

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentByNo(int stuNo) {
		return studentMapper.queryStudentByStuno(stuNo);
	}
	
	
}
