import hnzj.edu.cn.controller.StudentController;
import hnzj.edu.cn.entity.Student;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static final Logger logger=Logger.getLogger(AnnotationTest.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController = (StudentController) applicationContext.getBean("studentController");
        Student student = (Student) applicationContext.getBean("student");
        studentController.insertStudent(student);
        logger.error("error");
        logger.info("in11fo");
    }
}