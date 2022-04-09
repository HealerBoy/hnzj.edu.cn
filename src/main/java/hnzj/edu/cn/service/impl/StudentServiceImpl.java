package hnzj.edu.cn.service.impl;
import hnzj.edu.cn.dao.StudentDao;
import hnzj.edu.cn.entity.Student;
import hnzj.edu.cn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource( name = "studentDao")
    private StudentDao studentDao;
    @Override
    public int insertStudent(Student student) {
        return this.studentDao.insertStudent(student);
    }

    @Override
    public int deleteById(int id) {
        return this.studentDao.deleteById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return this.studentDao.updateStudent(student);
    }

    @Override
    public Student selectById(int id) {
        return this.studentDao.selectById(id);
    }
}
