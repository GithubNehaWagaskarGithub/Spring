package DepedencyInjection2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ryzen")
@Primary
public class Ryzen implements Processor{
    @Override
    public void processorType() {
        System.out.println("Processor Type Ryzen");
    }
}
