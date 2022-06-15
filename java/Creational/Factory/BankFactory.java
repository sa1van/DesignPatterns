package Creational.Factory;

public class BankFactory {

    public Bank getBank(String bankName) {

        if(bankName.equals("Hdfc")) {
            return new Hdfc();
        }
        else if(bankName.equals("Kotak")) {
            return new Kotak();
        }
        else {
            return null;
        }

    }

}
