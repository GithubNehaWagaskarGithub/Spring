package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lenovo")
public class Lenovo implements Laptop{
    @Autowired
    private Processor processor;
    @Override
    public void laptopType() {
        System.out.println("Lenovo");
    }

    @Override
    public void processorType() {
        processor.processorType();
    }
}
