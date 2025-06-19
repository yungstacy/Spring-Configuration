package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
       // Zoo zoo = (Zoo) context.getBean("myZoo", Zoo.class);
        //Person person = new Person(zoo);
        Person person = (Person) context.getBean("myPerson",Person.class);
        person.callPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
