package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = (Dog) context.getBean("myZoo", Dog.class);
        myDog.say();
        context.close();
    }
}
