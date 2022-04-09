package hnzj.edu.cn.service;

import hnzj.edu.cn.entity.Student;

public interface StudentService {
    int insertStudent(Student student);
    int deleteById(int id);
    int updateStudent(Student student);
    Student selectById(int id);
}
