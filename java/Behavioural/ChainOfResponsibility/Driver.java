package Behavioural.ChainOfResponsibility;


abstract class ATMDispenseMachine {

    ATMDispenseMachine nextChain;

    public void setNextChain(ATMDispenseMachine nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void dispense(int amount);
}

class Rupee50Dispense extends ATMDispenseMachine{

    @Override
    public void dispense(int amount) {

        int div = amount/50;
        int quo = amount%50;
        System.out.println("Number of 50 rupee notes given to you are " + String.valueOf(div));

        if(quo > 0)
        this.nextChain.dispense(quo);
    }
}

class Rupee20Dispense extends ATMDispenseMachine{

    @Override
    public void dispense(int amount) {

        int div = amount/20;
        int quo = amount%20;
        System.out.println("Number of 20 rupee notes given to you are " + String.valueOf(div));

        if(quo > 0)
        this.nextChain.dispense(quo);
    }
}

class Rupee10Dispense extends ATMDispenseMachine{

    @Override
    public void dispense(int amount) {

        int div = amount/10;
        int quo = amount%10;
        System.out.println("Number of 10 rupee notes given to you are " + String.valueOf(div));

        if(quo > 0) {
            System.out.println("Sorry cannot give you  " + String.valueOf(quo) + " rupees");
        }
    }
}


//Chain of responsibility pattern is used to achieve loose coupling in software
// design where a request from the client is passed to a chain of objects to process
// them. Later, the object in the chain will decide themselves who will be processing
// the request and whether the request is required to be sent to the next object in the
// chain or not.
public class Driver {

    ATMDispenseMachine atmDispenseMachine;

    public Driver() {
        this.atmDispenseMachine = new Rupee50Dispense();
        ATMDispenseMachine rupee20Dispense = new Rupee20Dispense();
        ATMDispenseMachine rupee10Dispense = new Rupee10Dispense();

        this.atmDispenseMachine.setNextChain(rupee20Dispense);
        rupee20Dispense.setNextChain(rupee10Dispense);
    }

    public void getMoney(int amount) {
        this.atmDispenseMachine.dispense(amount);
    }

    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.getMoney(130);

        System.out.println();

        driver.getMoney(134);

    }
}
