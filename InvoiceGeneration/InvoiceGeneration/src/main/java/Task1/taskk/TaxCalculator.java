package Task1.taskk;

import java.util.List;


public class TaxCalculator {

    private  Tax taxCal;

    public TaxCalculator(Tax taxCal) {
        this.taxCal = taxCal;
    }


    public void calculateTax(List<Product> productList){
        double totalTax = 0;
        double totalPrice = 0;

        System.out.println("Product"+"\t"+"Price"+"\t"+"Tax");

            for (Product product:productList){
                double taxPercentage =0;
                for (String taxName : product.getTaxGroup().getTaxGroup()) {
                    taxPercentage += taxCal.getTaxPercentage(taxName);
                }

                double taxAmount = taxPercentage;

                totalTax += taxAmount;
                totalPrice += product.getPrice() ;


        System.out.println(product.getName()+"\t"+product.getPrice()+"\t"+taxAmount);}
        System.out.println("Total price "+ totalPrice);
        System.out.println("Total tax " + totalTax);
        System.out.println("Grand total "+ (totalPrice+totalTax));

    }
}
