package spring_intro;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestXmlConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
Zoo zoo = (Zoo) context.getBean("myZoo", Zoo.class);
zoo.say();
context.close();
    }
}
