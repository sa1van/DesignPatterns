package Creational.AbstractFactory;

public class HomeLoan extends Loan{

    public void setLoanRate(double r) {
        rate = r;
    }

    @Override
    double getRate() {
        return rate;
    }

}
