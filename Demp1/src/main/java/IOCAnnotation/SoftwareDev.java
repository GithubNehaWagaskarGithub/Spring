package IOCAnnotation;

import org.springframework.stereotype.Component;

@Component("dev")
public class SoftwareDev implements Course{
    @Override
    public void courseType() {
        System.out.println("Course Type is Software Development");
    }

    @Override
    public void courseSubjects() {
        System.out.println("J2EE Hibernate Spring");
    }
}
