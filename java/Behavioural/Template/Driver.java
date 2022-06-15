package Behavioural.Template;

//    It defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
//    It lets subclasses redefine certain steps of an algorithm without changing the algorithm
//    structure.

//    Generally the class defines certain abstract methods that the subclasses need to implement.
//    These methods are called in the original algorithm that subclasses cannot change.
//
//    Although subclasses can override other available methods that are being consumed in the algorithm
//    to provide a different implementation as that given in the abstract class.
abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring in Cup");
    }

    public abstract void addCondiments();
}

class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}


public class Driver {
    public static void main(String[] args) {

        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();

        System.out.println();

        caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();

    }
}
