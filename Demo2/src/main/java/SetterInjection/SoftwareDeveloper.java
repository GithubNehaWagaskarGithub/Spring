package SetterInjection;

public class SoftwareDeveloper implements Designation{
    @Override
    public void designType() {
        System.out.println("Software Developer");
    }

    @Override
    public void getSubjects() {
        System.out.println("Java SQL J2EE Hibernate Spring");
    }

    @Override
    public void eachSubjectPrice(int price) {
        double qty=5;
        System.out.println("Each Subject Price :"+price*qty);
    }
}
