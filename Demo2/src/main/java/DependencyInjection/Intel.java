package DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("intel")
public class Intel implements Processor{
    @Override
    public void processorType() {
        System.out.println("Intel Processor");
    }
}
