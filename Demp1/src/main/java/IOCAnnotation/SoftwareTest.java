package IOCAnnotation;

import org.springframework.stereotype.Component;

@Component("Test")
public class SoftwareTest implements Course{
    @Override
    public void courseType() {
        System.out.println("Software Testing");
    }

    @Override
    public void courseSubjects() {
        System.out.println("Manual Selenium API");
    }
}
