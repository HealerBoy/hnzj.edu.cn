import org.apache.log4j.Logger;

public class JunitTest {
    public static final Logger logger=Logger.getLogger(AnnotationTest.class);
    public static void main(String[] args) {
        logger.info("info");
        logger.error("error");
    }
}
