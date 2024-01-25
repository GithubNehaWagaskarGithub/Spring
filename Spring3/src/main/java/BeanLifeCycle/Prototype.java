package BeanLifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pro")
@Scope("prototype")
public class Prototype {
    void prototypeMethod()
    {
        System.out.println("Prototype Method");
    }
}
