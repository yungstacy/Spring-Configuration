package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = (Dog) context.getBean("myZoo", Dog.class);
        myDog.setName("Белка");
        Dog yourDog = (Dog) context.getBean("myZoo", Dog.class);
        yourDog.setName("Стрелка");
        System.out.println("Переменные ссылаются на один и тот же объект в памяти? " + (myDog == yourDog));
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());
        context.close();
    }
}
