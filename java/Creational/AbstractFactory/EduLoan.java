package Creational.AbstractFactory;

public class EduLoan extends Loan{

    public void setLoanRate(double r) {
        rate = r;
    }

    @Override
    double getRate() {
        return rate;
    }
}
