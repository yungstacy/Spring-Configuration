package spring_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    Person person = context.getBean("personBean",Person.class);
    person.callPet();
    context.close();
    }
}
