package DependencyInjection;

import org.springframework.stereotype.Component;

@Component("ryzen")
public class Ryzen implements Processor{
    @Override
    public void processorType() {
        System.out.println("Ryzen Processor");
    }
}
