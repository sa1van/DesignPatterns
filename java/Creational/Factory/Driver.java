package Creational.Factory;

import java.util.Scanner;

//It lets a class defer instantiation to subclasses
public class Driver {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank name");
        String bankName = sc.next();

        BankFactory bankFactory = new BankFactory();
        Bank bank = bankFactory.getBank(bankName);

        if(bank != null) {
            System.out.println(bank.getBankName());
        }
        else {
            System.out.println("Invalid Bank Name");
        }

    }
}
