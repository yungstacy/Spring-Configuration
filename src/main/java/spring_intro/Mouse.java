package spring_intro;

import org.springframework.stereotype.Component;
//В скобках id бина, но можно его не указывать, тогда Spring пропишет id сам
@Component("mouseBean")
public class Mouse implements Zoo {
    public Mouse() {
        System.out.println("Mouse bean is created");
    }

    @Override
    public void say() {
        System.out.println("Pipipipi...");
    }
}
