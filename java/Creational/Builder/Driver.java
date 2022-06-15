package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

interface Bank {
    public String name();
    public StockExchange getExchange();
    public String centralBank();
}

interface StockExchange {
    public String stockExchangeName();
}

class Bse implements StockExchange {

    @Override
    public String stockExchangeName() {
        return "BSE";
    }
}

class Nse implements StockExchange {

    @Override
    public String stockExchangeName() {
        return "NSE";
    }
}

abstract class CentralBank implements Bank {
    @Override
    public String centralBank() {
        return "RBI";
    }
}

class Hdfc extends CentralBank {
    @Override
    public String name() {
        return "HDFC";
    }

    @Override
    public StockExchange getExchange() {
        return new Bse();
    }
}

class Icici extends CentralBank {
    @Override
    public String name() {
        return "ICICI";
    }

    @Override
    public StockExchange getExchange() {
        return new Nse();
    }
}

class BanksInIndia {
    List<Bank> bankList = new ArrayList<>();

    public void showBanks() {
        for(Bank b : bankList) {
            System.out.println(b.name() + " Stock exchange name is " + b.getExchange().stockExchangeName());
        }
    }

    public void addBankToList(Bank b) {
        this.bankList.add(b);
    }
}

class Builder {
    public BanksInIndia builder() {
        BanksInIndia banksInIndia = new BanksInIndia();
        banksInIndia.addBankToList(new Hdfc());
        banksInIndia.addBankToList(new Icici());

        return banksInIndia;
    }
}


public class Driver {
    public static void main(String[] args) {

        Builder builder = new Builder();
        BanksInIndia banksInIndia = builder.builder();

        banksInIndia.showBanks();

    }
}
