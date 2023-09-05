package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dell")
public class Dell implements Laptop{
    @Autowired
    private   Processor processor;
    @Override
    public void laptopType() {
        System.out.println("Dell");
    }

    @Override
    public void processorType() {
        processor.processorType();
    }
}
