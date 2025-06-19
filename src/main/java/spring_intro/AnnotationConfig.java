package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//Mouse myMouse = (Mouse) context.getBean("mouseBean", Mouse.class);
//myMouse.say();
Person person = (Person) context.getBean("personBean", Person.class);
person.callPet();
System.out.println(person.getName());
System.out.println(person.getAge());
    }

}
