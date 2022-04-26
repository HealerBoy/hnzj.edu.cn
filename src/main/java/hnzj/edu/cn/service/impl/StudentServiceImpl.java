package hnzj.edu.cn.service.impl;
import hnzj.edu.cn.dao.StudentDao;
import hnzj.edu.cn.entity.Student;
import hnzj.edu.cn.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    /*DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    @Resource( name = "studentDao")
    StudentDao studentDao;
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
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
