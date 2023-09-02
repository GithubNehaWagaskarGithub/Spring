package ConstructorInjection1;

public class Calculator {
    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Integer Type");
    }

    public Calculator(double num1, double num2) {
        this.num1 = (int)num1;
        this.num2 = (int)num2;
        System.out.println("Double Type");
    }

    public Calculator(String num1, String num2) {
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
        System.out.println("String Type");
    }
    void add()
    {
        System.out.println("Num1 :"+num1);
        System.out.println("Num2 :"+num2);
        System.out.println("Addition is :"+(num1+num2));
    }
}
