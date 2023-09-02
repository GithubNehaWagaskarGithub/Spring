package ConstructorInjection3;

public class Calculator {
    double num1;
    double num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Integer Type Constructor");
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Double Type Constructor");
    }
    void sub()
    {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Subtraction :"+(num2-num1));
    }
}
