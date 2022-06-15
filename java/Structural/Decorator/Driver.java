package Structural.Decorator;


abstract class Beverage {
    protected String name;

    public String description() {
      return name;
    }

    public abstract double cost();
}

class Espresso extends Beverage {
    public Espresso() {
        name = "Espresso";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}

class HouseBlend extends Beverage {
    public HouseBlend() {
        name = "HouseBlend";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}

abstract class CondimentDecorator extends Beverage {
    public abstract String description();
}

class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 10.0;
    }

    @Override
    public String description() {
       return this.beverage.description() + " Mocha";
    }
}

class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 15.0;
    }

    @Override
    public String description() {
        return this.beverage.description() + " Whip";
    }
}

//Decorator pattern lets you attach new behaviors to objects by placing these
// objects inside special wrapper objects that contain the behaviors.
public class Driver {
    public static void main(String[] args) {

        Beverage houseBlend = new HouseBlend();
        Beverage houseBlendWithWhip = new Whip(houseBlend);
        Beverage houseBlendWithWhipWithMocha = new Mocha(houseBlendWithWhip);

        System.out.println(houseBlend.description() + " " + houseBlend.cost());
        System.out.println(houseBlendWithWhip.description() + " " + houseBlendWithWhip.cost());
        System.out.println(houseBlendWithWhipWithMocha.description() + " " + houseBlendWithWhipWithMocha.cost());


//        Beverage houseBlendWithWhipWithDoubleMocha = new Mocha(houseBlendWithWhipWithMocha);
//        System.out.println(houseBlendWithWhipWithDoubleMocha.description() + " " + houseBlendWithWhipWithDoubleMocha.cost());


    }
}
