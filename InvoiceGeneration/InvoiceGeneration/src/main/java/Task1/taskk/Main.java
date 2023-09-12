package Task1.taskk;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        //For storing the tax and it's individual percentile
        Tax tax = new Tax();
        tax.addTax("No Tax" ,0.0);
        tax.addTax("VAT",2.0);
        tax.addTax("SGST",1.2);
        tax.addTax("CGST",1.5);


        TaxGroup group1 = new TaxGroup();
        group1.addTaxToGroup("VAT");

        TaxGroup group2 = new TaxGroup();
        group2.addTaxToGroup("CGST");

        TaxGroup group3 = new TaxGroup();
         group3.addTaxToGroup("SGST");

        TaxGroup group4 = new TaxGroup();
        group4.addTaxToGroup("CGST");
        group4.addTaxToGroup("SGST");

        Product product1 = new Product("Rice", 5.0, new TaxGroup()); // No tax
        Product product2 = new Product("Petrol", 65.0, group1); // VAT
        Product product3 = new Product("Soap", 10.0, group2); // SGST
        Product product4 = new Product("Laptop", 40.0, group3); // CGST
        Product product5 = new Product("Car",78.0,group4);//SGST & CGST


        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        TaxCalculator calculator = new TaxCalculator(tax);
        calculator.calculateTax(productList);

    }

}
