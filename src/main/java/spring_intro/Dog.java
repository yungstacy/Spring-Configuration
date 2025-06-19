package spring_intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dog")
@Scope("singleton")
public class Dog implements Zoo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
    @PostConstruct
    public void init() {
        System.out.println("Dog bean is initialized");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Dog bean is destroyed");
    }

    @Override
    public void say() {
        System.out.println("Barking...");
    }
}
