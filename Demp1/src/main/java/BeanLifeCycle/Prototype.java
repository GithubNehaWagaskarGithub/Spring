package BeanLifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Pro")
@Scope("prototype")
public class Prototype {
    void prototype(){
        System.out.println("Prototype Method");
    }
}
