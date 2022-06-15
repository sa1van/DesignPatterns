package Creational.AbstractFactory;

abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loanName);
}

class BankFactory extends AbstractFactory {

    @Override
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

    @Override
    public Loan getLoan(String loanName) {
        return null;
    }

}

class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {

        if(loanName.equals("HomeLoan")) {
            return new HomeLoan();
        }
        else if(loanName.equals("EduLoan")) {
            return new EduLoan();
        }
        else {
            return null;
        }

    }
}

class FactoryCreator {

    public static AbstractFactory getFactory(String factory) {

        if(factory.equals("Bank")) {
            return new BankFactory();
        }
        else if(factory.equals("Loan")) {
            return new LoanFactory();
        }
        else {
            return null;
        }

    }

}
