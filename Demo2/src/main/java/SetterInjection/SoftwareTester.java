package SetterInjection;

public class SoftwareTester implements Designation{
    @Override
    public void designType() {
        System.out.println("Software Tester");
    }

    @Override
    public void getSubjects() {
        System.out.println("Java SQL Manual Selenium API");
    }

    @Override
    public void eachSubjectPrice(int price) {
        int qty=5;
        System.out.println("Each Subject Price :"+price*qty);
    }
}
