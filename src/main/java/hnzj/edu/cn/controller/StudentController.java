package hnzj.edu.cn.controller;
import hnzj.edu.cn.entity.Student;
import hnzj.edu.cn.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource(name = "studentService")
    StudentService studentService;
    @RequestMapping(value = "/insertStudent")
    public int insertStudent(Student student) {
        return this.studentService.insertStudent(student);
    }

    public int deleteById(int id) {
        return this.studentService.deleteById(id);
    }

    public int updateStudent(Student student) {
        return this.studentService.updateStudent(student);
    }

    public Student selectById(int id) {
        return this.studentService.selectById(id);
    }
}
