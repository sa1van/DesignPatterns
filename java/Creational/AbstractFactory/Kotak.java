package Creational.AbstractFactory;

public class Kotak extends Bank {

    private final String bankName;

    public Kotak() {
        this.bankName = "Kotak";
    }

    @Override
    String getBankName() {
        return bankName;
    }
}
