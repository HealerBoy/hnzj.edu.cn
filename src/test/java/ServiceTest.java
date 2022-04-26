import hnzj.edu.cn.controller.StudentController;
import hnzj.edu.cn.entity.Student;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml", "classpath:application-dao.xml","classpath:spring-mvc.xml"})
public class ServiceTest {
    @Autowired
    private StudentController studentController;
    @Test
    public void SelectTest(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-mvc.xml","application-service.xml","application-dao.xml");
        Student student=(Student) applicationContext.getBean("student",Student.class);
        studentController.insertStudent(student);
        System.out.println();
/*        Logger logger = Logger.getLogger(StudentController.class);
        PropertyConfigurator.configure("log4j.properties");
        logger.debug("Here is DEBUG messgae");
        logger.info("Here is INFO message");
        logger.warn("Here is WARN message");
        logger.error("Here is ERROR message");
        logger.fatal("Here is FATAL message");*/
    }
}
