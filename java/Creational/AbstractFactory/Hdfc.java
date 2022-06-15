package Creational.AbstractFactory;

public class Hdfc extends Bank {

    private final String bankName;

    public Hdfc() {
        this.bankName = "Hdfc";
    }

    @Override
    String getBankName() {
        return bankName;
    }

}
