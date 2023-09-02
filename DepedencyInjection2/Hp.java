package DepedencyInjection2;

import org.springframework.beans.factory.annotation.Autowired;

public class Hp implements Laptop{
    @Autowired
    private Processor processor;
    @Override
    public void laptopType() {
        System.out.println("Hp Laptop");
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void processorType() {
        processor.processorType();
    }
}
