package BeanLifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sin")
@Scope("singleton")
public class Singleton {

    void singleMethod()
    {
        System.out.println("Singleton Method");
    }
}
