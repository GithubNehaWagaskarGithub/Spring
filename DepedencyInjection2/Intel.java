package DepedencyInjection2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("intel")

public class Intel implements Processor{
    @Override
    public void processorType() {
        System.out.println("Processor Type Intel");
    }
}
