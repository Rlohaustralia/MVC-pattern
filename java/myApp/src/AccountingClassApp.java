class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;


    public void print() {
        System.out.println("Value of supply: " + valueOfSupply);
        System.out.println("VAT: " + getVat());
        System.out.println("Total: " + getTotal());
        System.out.println("Expense: " + getExpense());
        System.out.println("Income: " + getIncome());
        System.out.println("Dividend 1: " + getDividend1());
        System.out.println("Dividend 2: " + getDividend2());
        System.out.println("Dividend 3: " + getDividend3());
    }


    private double getDividend3() {
        double dividend3 = getIncome() * 0.2;
        return dividend3;
    }

    private double getDividend2() {
        double dividend2 = getIncome() * 0.3;
        return dividend2;
    }

    private double getDividend1() {
        double dividend1 = getIncome() * 0.5;
        return dividend1;
    }

    private double getIncome() {
        return valueOfSupply - getExpense();
    }

    private double getExpense() {
        double expense = valueOfSupply * expenseRate;
        return expense;
    }

    private double getTotal() {
        double total = valueOfSupply + getVat();
        return total;
    }

    private double getVat() {
        return valueOfSupply * vatRate;
    }
}


public class AccountingClassApp {
    public static void main(String[] args) {

        // instance
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();

        a1.print();




    }
}