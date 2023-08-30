package BeanLifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Sin")
@Scope("singleton")
public class Single {
    void single(){
        System.out.println("Single Method");
    }
}
