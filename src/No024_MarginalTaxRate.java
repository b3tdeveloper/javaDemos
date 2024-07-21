/******************************************************************************
 *  Compilation:  javac MarginalTaxRate.java
 *  Execution:    java MarginalTaxRate income
 *
 *  Prints the marginal tax rate for a given income.
 *
 *  % java MarginalTaxRate 100000
 *  marginal tax rate = 0.28
 *
 *  % java MarginalTaxRate 100
 *  marginal tax rate = 0.1
 *
 *  % java MarginalTaxRate 1000000
 *  marginal tax rate = 0.396
 *
 * Reference : https://www.nerdwallet.com/article/taxes/federal-income-tax-brackets
 *
 ******************************************************************************/
public class No024_MarginalTaxRate {
    public static void main(String[] args){
        int income = Integer.parseInt(args[0]);

        double taxRate = 0.0;

        if      (income >= 0      && income <= 11600)  taxRate = 0.10;
        else if (income >= 11601  && income <= 47150)  taxRate = 0.12;
        else if (income >= 47151  && income <= 100525) taxRate = 0.22;
        else if (income >= 100526 && income <= 191950) taxRate = 0.24;
        else if (income >= 191951 && income <= 243725) taxRate = 0.32;
        else if (income >= 243726 && income <= 609350) taxRate = 0.35;
        else if (income >= 609351)                     taxRate = 0.37;

        System.out.println("Marginal tax rate = " + taxRate);
    }
}
