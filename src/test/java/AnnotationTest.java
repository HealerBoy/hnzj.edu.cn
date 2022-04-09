import hnzj.edu.cn.controller.StudentController;
import hnzj.edu.cn.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void AnnotationTest1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController = (StudentController) applicationContext.getBean("studentController");
        Student student = (Student) applicationContext.getBean("student");
        studentController.insertStudent(student);
    }
}
