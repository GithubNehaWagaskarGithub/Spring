package SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Engineer {
    @Autowired
    @Qualifier("sd")
    private Designation designation;

    void designType()
    {
        designation.designType();
    }
    void getSubjects()
    {
        designation.getSubjects();
    }
    void eachSubjectPrice(int price)
    {
        designation.eachSubjectPrice(8000);
    }
}
