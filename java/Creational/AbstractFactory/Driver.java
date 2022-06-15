package Creational.AbstractFactory;

import java.util.Scanner;

//It lets you produce families of related objects without specifying their concrete classes.
public class Driver {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name");

        String bankName = sc.next();

        AbstractFactory abstractFactory = FactoryCreator.getFactory("Bank");
        Bank bank = abstractFactory.getBank(bankName);

        System.out.println(bank.getBankName());
        bank.banksOrigin();


        System.out.println("Enter type of loan from " + bank.getBankName() + " bank");
        String loanType = sc.next();

        System.out.println("Enter loan rate for " + bank.getBankName());
        Double rate = sc.nextDouble();

        abstractFactory = FactoryCreator.getFactory("Loan");
        Loan loan = abstractFactory.getLoan(loanType);

        loan.setLoanRate(rate);

        System.out.println("Enter loan amount");
        int loanAmount = sc.nextInt();

        System.out.println("Enter number of years to pay entire loan amount");
        int years = sc.nextInt();

        loan.calculateLoanPayment(loanAmount,years);

    }
}
