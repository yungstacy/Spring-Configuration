package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("mouseBean")
    private Zoo zoo;
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("mouseBean") Zoo zoo) {
        System.out.println("Person bean is created");
        this.zoo = zoo;
    }
//   @Autowired
//   @Qualifier("dog")
//    public void setZoo(Zoo zoo) {
//        System.out.println("Class Person: set pet");
//        this.zoo = zoo;
//    }

    public void callPet() {
        System.out.println("Hello, my Pet!");
        zoo.say();
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
