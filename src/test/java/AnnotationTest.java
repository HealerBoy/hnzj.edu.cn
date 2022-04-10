import hnzj.edu.cn.controller.StudentController;
import hnzj.edu.cn.entity.Student;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static final Logger logger=Logger.getLogger(AnnotationTest.class);
    public static ApplicationContext applicationContext;
    public StudentController studentController;
    public Student student;
    public static StudentController getStudentController(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        return (StudentController) applicationContext.getBean("studentController");
    }
    public static Student getStudent(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        return (Student) applicationContext.getBean("student");
    }
    @Test
    public void insertStudentTest(){
        student = getStudent();
        getStudentController().insertStudent(student);
        logger.error("error");
        logger.info("in1fo");
    }
    @Test
    public void selectStudentTest(){
        student = getStudentController().selectById(1);
        System.out.println(student.toString());
    }
}